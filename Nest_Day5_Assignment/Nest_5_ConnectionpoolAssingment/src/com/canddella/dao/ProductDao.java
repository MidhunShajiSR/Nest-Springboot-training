package com.canddella.dao;

import java.util.List;

import com.canddella.entity.Product;

public interface ProductDao {

	public List<Product> listAllProducts();

	public Product getProduct(String productCode);

	public void deleteProduct(String productCode);

	public void saveProduct(Product product, String pCode);

}
