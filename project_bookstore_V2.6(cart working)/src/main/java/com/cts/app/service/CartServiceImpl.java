package com.cts.app.service;

import java.util.List;

import com.cts.app.dao.CartDao;
import com.cts.app.exceptions.ClassNotFoundException;
import com.cts.app.exceptions.SystemException;
import com.cts.app.model.Cart;
import com.cts.app.model.Product;

public class CartServiceImpl implements CartService {
	
	// CartDao -> setter
	private CartDao cartDao;

	public void setCartDao(CartDao cartDao) {
		this.cartDao = cartDao;
	}
	
	// Show all items from Cart
	@Override
	public List<Cart> getCartList() {
		return cartDao.getCartList();
	}
	
	
//	@Override
//	public List<Cart> putBookToCart(String bookName, int quantity) throws ClassNotFoundException, SystemException {
//
//		return cartDao.getCartList();		
//		
//	    // Book list from ProductTable is inserted into Cart 
//		List<Product> Books = cartDao.putBookToCart(bookName ,quantity);
//	    
//	    if (Books.isEmpty()) {
//	        throw new ClassNotFoundException("Book :" + bookName + " does not Exists in the Cart with quantity :"+quantity );
//	    }
//	    
//	    return Books;
//	}

	public boolean putBookToCart(Cart cart) {
		boolean newProd = cartDao.putBookToCart(cart);
		if(newProd) {
			System.out.println("New Book is added to Cart successfully!!! ");
		}
		else {
			System.out.println("Error : Unable to add Item to Cart. Sorry for inconvenience.");
		}
		return newProd;
		
	}

}
