package com.cts.app.service;

import java.util.List;
import java.util.Optional;

import com.cts.app.dao.ProductDao;
import com.cts.app.exceptions.ClassNotFoundException;
import com.cts.app.exceptions.SystemException;
import com.cts.app.model.Product;

public class ProductServiceImpl implements ProductService {
	private ProductDao productDao;

	public void setProductDao(ProductDao productDao) {
		this.productDao = productDao;
	}
	@Override
	public List<Product> getAllProduct() {

		return productDao.getAllProduct();
	}
	@Override
	public Product getProductByName(String prodName) throws ClassNotFoundException, SystemException {
		
		Optional<Product> optionalProduct = productDao.getProductByName(prodName);
		
		
		if (optionalProduct.isEmpty()) {
			throw new ClassNotFoundException("Product NAME does not Exists : " +prodName );
			}
		return optionalProduct.get();
	}
	
//	@Override
//	public boolean create_Product(Product product) {
//		return productDao.create_Product(product);
//	}
//

}
