package com.canddella.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import com.canddella.dao.ProductDao;
import com.canddella.dao.ProductDaoImpl;
import com.canddella.entity.Product;

public class ProductServiceImpl implements ProductService {

	ProductDao productDao = new ProductDaoImpl();

	@Override
	public List<Product> listAllProducts() {

		return productDao.listAllProducts();
	}

	@Override
	public Product getProduct(String productCode) {
		// TODO Auto-generated method stub
		return productDao.getProduct(productCode);
	}

	@Override
	public void deleteProduct(String productCode) {
		// TODO Auto-generated method stub
		productDao.deleteProduct(productCode);
	}

	@Override
	public void saveProduct() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter product code : ");
		String pCode = scanner.nextLine();
		System.out.println("Enter productName :");
		String pName = scanner.nextLine();
		System.out.println("Enter product description :");
		String des = scanner.nextLine();
		System.out.println("activationDate : ");
		String dob = scanner.nextLine();
		SimpleDateFormat dateFormat1 = new SimpleDateFormat("yyyy-MM-dd");
		Date date1 = null;
		try {
			date1 = dateFormat1.parse(dob);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		System.out.println("expiryDate : ");
		String eDob = scanner.nextLine();
		SimpleDateFormat dateFormat2 = new SimpleDateFormat("yyyy-MM-dd");
		Date date2 = null;
		try {
			date2 = dateFormat1.parse(eDob);
		} catch (ParseException e) {
			e.printStackTrace();
		}

		Product product = new Product(pCode, pName, des, date1, date2);
		ProductDao productDao = new ProductDaoImpl();
		productDao.saveProduct(product, pCode);

	}

}
