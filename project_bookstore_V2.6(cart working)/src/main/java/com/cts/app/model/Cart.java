package com.cts.app.model;

import com.cts.app.model.Product;


public class Cart {
	private int cartId;
    private int cartUserId;
    private int cartProductId;
    private int cartQuantity;
    private double cartPrice;
    String cartBookName;
    
    
	public String getCartBookName() {
		return cartBookName;
	}
	public void setCartBookName(String cartBookName) {
		this.cartBookName = cartBookName;
	}
	public int getCartId() {
		return cartId;
	}
	public void setCartId(int cartId) {
		this.cartId = cartId;
	}
	public int getCartUserId() {
		return cartUserId;
	}
	public void setCartUserId(int cartUserId) {
		this.cartUserId = cartUserId;
	}
	public int getCartProductId() {
		return cartProductId;
	}
	public void setCartProductId(int cartProductId) {
		this.cartProductId = cartProductId;
	}
	public int getCartQuantity() {
		return cartQuantity;
	}
	public void setCartQuantity(int cartQuantity) {
		this.cartQuantity = cartQuantity;
	}
	public double getCartPrice() {
		return cartPrice;
	}
	public void setCartPrice(double cartPrice) {
		this.cartPrice = cartPrice;
	}
	public Cart(int cartId, int cartUserId, int cartProductId, int cartQuantity, double cartPrice) {
		super();
		this.cartId = cartId;
		this.cartUserId = cartUserId;
		this.cartProductId = cartProductId;
		this.cartQuantity = cartQuantity;
		this.cartPrice = cartPrice;
	}
	public Cart(int cartUserId, int cartProductId, int cartQuantity, double cartPrice) {
		super();
		this.cartUserId = cartUserId;
		this.cartProductId = cartProductId;
		this.cartQuantity = cartQuantity;
		this.cartPrice = cartPrice;
	}
	
	
	public Cart(String cartBookName, int cartUserId, int cartQuantity) {
		super();
		this.cartBookName = cartBookName;
		this.cartUserId = cartUserId;
		this.cartQuantity = cartQuantity;
	}
	@Override
	public String toString() {
		return "Cart [cartId=" + cartId + ", cartUserId=" + cartUserId + ", cartProductId=" + cartProductId
				+ ", cartQuantity=" + cartQuantity + ", cartPrice=" + cartPrice + "]";
	}
	public Object getCartBookName1() {
		
		return cartBookName;
	}
    
	

}
