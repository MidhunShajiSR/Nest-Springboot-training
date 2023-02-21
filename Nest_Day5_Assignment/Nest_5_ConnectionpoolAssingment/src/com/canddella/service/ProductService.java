package com.canddella.service;

import java.util.List;

import com.canddella.entity.Product;

public interface ProductService {

	public List<Product> listAllProducts();

	public Product getProduct(String productCode);

	public void deleteProduct(String productCode);

	public void saveProduct();

}
