package com.cts.app.dao;

import java.util.List;
import java.util.Optional;

import com.cts.app.exceptions.SystemException;
import com.cts.app.model.Product;

public interface ProductDao {
	List<Product> getAllProduct();
	Optional<Product> getProductByName(String prodName) throws SystemException;
//	boolean create_Product(Product product);

}