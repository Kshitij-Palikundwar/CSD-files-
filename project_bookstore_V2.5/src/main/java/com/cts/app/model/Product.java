package com.cts.app.model;

public class Product {
	
	private int pId;
	private int pUserId;
	private String pName;
	private String pAuth;
	private String pDesc;
	private String pPrice;
	private String pQuantity;
	private int pCategory;

	
	public Product(int pUserId, String pName, String pAuth, String pDesc, String pPrice, String pQuantity,
			int pCategory) {
		super();
		this.pUserId = pUserId;
		this.pName = pName;
		this.pAuth = pAuth;
		this.pDesc = pDesc;
		this.pPrice = pPrice;
		this.pQuantity = pQuantity;
		this.pCategory = pCategory;
	}
	
	public Product(int pId, int pUserId, String pName, String pAuth, String pDesc, String pPrice, String pQuantity,
			int pCategory) {
		super();
		this.pId = pId;
		this.pUserId = pUserId;
		this.pName = pName;
		this.pAuth = pAuth;
		this.pDesc = pDesc;
		this.pPrice = pPrice;
		this.pQuantity = pQuantity;
		this.pCategory = pCategory;
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
	public int getpCategory() {
		return pCategory;
	}
	public void setpCategory(int pCategory) {
		this.pCategory = pCategory;
	}
	
	@Override
	public String toString() {
		return "Product [pId=" + pId + ", pUserId=" + pUserId + ", pName=" + pName + ", pAuth=" + pAuth + ", pDesc="
				+ pDesc + ", pPrice=" + pPrice + ", pQuantity=" + pQuantity + ", pCategory=" + pCategory + "]";
	}
}
