package com.cts.app.service;

import java.util.List;

import com.cts.app.exceptions.SystemException;
import com.cts.app.exceptions.ClassNotFoundException;
import com.cts.app.model.Product;

public interface ProductService {
	List<Product> getAllProduct();

	Product getProductByName(String prodName) throws ClassNotFoundException, SystemException;

//	boolean create_Product(Product product);
}
