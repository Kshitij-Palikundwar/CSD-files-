package com.cts.app.dao;

import java.util.List;
import com.cts.app.model.Cart;

public interface CartDao {
	List<Cart> getCartList();
	boolean putBookToCart(Cart cart);

}
