package com.cts.app.service;

import java.util.List;
import com.cts.app.exceptions.ClassNotFoundException;
import com.cts.app.exceptions.SystemException;
import com.cts.app.model.Cart;
import com.cts.app.model.Genre;
import com.cts.app.model.Product;

public interface CartService {
	
	List<Cart> getCartList();
	//List<Cart> putBookToCart(String bookName, int cartBookQuant) throws SystemException, ClassNotFoundException;
	//Genre getGenreByName(String genreName) throws SystemException, ClassNotFoundException;
	boolean putBookToCart(Cart cart);
}
	
