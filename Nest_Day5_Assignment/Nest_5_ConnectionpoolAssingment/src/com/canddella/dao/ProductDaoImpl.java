package com.canddella.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.canddella.connectionpool.ConnectionPool;
import com.canddella.entity.Product;

public class ProductDaoImpl implements ProductDao {

	@Override
	public void saveProduct(Product product, String pCode) {

		Connection connection = null;
		PreparedStatement prepStmt = null;
		try {
			String selectSQL = "insert into product (productcode,productname,productdescription,activationdate,expirtydate)"
					+ "values(?,?,?,?,?)";
			DataSource ds = ConnectionPool.getDataSource();
			connection = ds.getConnection();
			prepStmt = connection.prepareStatement(selectSQL);
			prepStmt.setString(1, pCode);
			prepStmt.setString(2, product.getProductName());
			prepStmt.setString(3, product.getProductDescription());
			prepStmt.setDate(4, new java.sql.Date(product.getActivationDate().getTime()));
			prepStmt.setDate(5, new java.sql.Date(product.getExpiryDate().getTime()));

			prepStmt.execute();
			connection.close();
		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	@Override
	public List<Product> listAllProducts() {
		// TODO Auto-generated method stub
		List<Product> productList = new ArrayList<Product>();
		Connection connection = null;
		String selectSQL = "Select * from product";
		PreparedStatement prepStmt = null;
		try {

			DataSource ds = ConnectionPool.getDataSource();
			connection = ds.getConnection();
			prepStmt = connection.prepareStatement(selectSQL);
			ResultSet resultSet = prepStmt.executeQuery();

			while (resultSet.next()) {

				productList.add(new Product(resultSet.getString(2), resultSet.getString(3), resultSet.getString(4),
						resultSet.getDate(5), resultSet.getDate(6)));
			}

			connection.close();

		} catch (SQLException e) {

			e.printStackTrace();
		}
		return productList;
	}

	@Override
	public Product getProduct(String productCode) {

		Product product = null;

		Connection connection = null;
		String selectSQL = "Select * from product where productCode =\"" + productCode + "\"";

		PreparedStatement prepStmt = null;
		try {

			DataSource ds = ConnectionPool.getDataSource();
			connection = ds.getConnection();
			prepStmt = connection.prepareStatement(selectSQL);
			ResultSet resultSet = prepStmt.executeQuery();

			while (resultSet.next()) {
				product = (new Product(resultSet.getString(2), resultSet.getString(3), resultSet.getString(4),
						resultSet.getDate(5), resultSet.getDate(6)));
				;

			}
			connection.close();

		} catch (SQLException e) {

			e.printStackTrace();
		}
		return product;

	}

	@Override
	public void deleteProduct(String productCode) {

		Connection connection = null;
		PreparedStatement prepStmt = null;
		try {
			String selectSQL = "delete from product where productCode =\"" + productCode + "\"";
			DataSource ds = ConnectionPool.getDataSource();
			connection = ds.getConnection();
			prepStmt = connection.prepareStatement(selectSQL);

			prepStmt.execute();
			connection.close();

		} catch (SQLException e) {

			e.printStackTrace();
		}
	}
}
