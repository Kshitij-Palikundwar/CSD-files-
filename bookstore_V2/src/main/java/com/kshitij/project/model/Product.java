package com.kshitij.project.model;

public class Product {
	User user;
	private int pId;
	private int pUserId = user.getuId();
	private String pName;
	private String pAuth;
	private String pDesc; 
	private String pPrice;
	private String pQuantity;
	private int pGenreId;
	
	
	// Constructors
	public Product(User user, int pId, int pUserId, String pName, String pAuth, String pDesc, String pPrice,
			String pQuantity, int pGenreId) {
		super();
		this.user = user;
		this.pId = pId;
		this.pUserId = pUserId;
		this.pName = pName;
		this.pAuth = pAuth;
		this.pDesc = pDesc;
		this.pPrice = pPrice;
		this.pQuantity = pQuantity;
		this.pGenreId = pGenreId;
	}
	
	public Product(User user, int pUserId, String pName, String pAuth, String pDesc, String pPrice, String pQuantity, int pGenreId) {
		super();
		this.user = user;
		this.pUserId = pUserId;
		this.pName = pName;
		this.pAuth = pAuth;
		this.pDesc = pDesc;
		this.pPrice = pPrice;
		this.pQuantity = pQuantity;
		this.pGenreId = pGenreId;
	}
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	// Getter Setters
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public int getpUserId() {
		return pUserId;
	}
	public void setpUserId(int pUserId) {
		this.pUserId = pUserId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public String getpAuth() {
		return pAuth;
	}
	public void setpAuth(String pAuth) {
		this.pAuth = pAuth;
	}
	public String getpDesc() {
		return pDesc;
	}
	public void setpDesc(String pDesc) {
		this.pDesc = pDesc;
	}
	public String getpPrice() {
		return pPrice;
	}
	public void setpPrice(String pPrice) {
		this.pPrice = pPrice;
	}
	public String getpQuantity() {
		return pQuantity;
	}
	public void setpQuantity(String pQuantity) {
		this.pQuantity = pQuantity;
	}
	
	public int getpGenreId() {
		return pGenreId;
	}
	public void setpGenreId(int pGenreId) {
		this.pGenreId = pGenreId;
	}
	
	// String 
	@Override
	public String toString() {
		return "Product [user=" + user + ", pId=" + pId + ", pUserId=" + pUserId + ", pName=" + pName + ", pAuth="
				+ pAuth + ", pDesc=" + pDesc + ", pPrice=" + pPrice + ", pQuantity=" + pQuantity +", pGenreId=" + pGenreId + "]";
	}

	
}
