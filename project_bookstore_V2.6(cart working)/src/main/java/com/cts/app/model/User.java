package com.cts.app.model;

public class User {
	private int uId;
	private String uName;
	private String uPh;
	private String uMail; 
	private String uAddr;
	private String uPass;
	
	public User(int uId, String uName, String uPh, String uMail, String uAddr, String uPass) {
		super();
		this.uId = uId;
		this.uName = uName;
		this.uPh = uPh;
		this.uMail = uMail;
		this.uAddr = uAddr;
		this.uPass = uPass;
	}
	
	public User(String uName, String uPh, String uMail, String uAddr, String uPass) {
		super();
		this.uName = uName;
		this.uPh = uPh;
		this.uMail = uMail;
		this.uAddr = uAddr;
		this.uPass = uPass;
	}
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getuId() {
		return uId;
	}

	public void setuId(int uId) {
		this.uId = uId;
	}

	public String getuName() {
		return uName;
	}

	public void setuName(String uName) {
		this.uName = uName;
	}

	public String getuPh() {
		return uPh;
	}

	public void setuPh(String uPh) {
		this.uPh = uPh;
	}

	public String getuMail() {
		return uMail;
	}

	public void setuMail(String uMail) {
		this.uMail = uMail;
	}

	public String getuAddr() {
		return uAddr;
	}

	public void setuAddr(String uAddr) {
		this.uAddr = uAddr;
	}

	public String getuPass() {
		return uPass;
	}

	public void setuPass(String uPass) {
		this.uPass = uPass;
	}

	@Override
	public String toString() {
		return "[uId=" + uId + ", uName=" + uName + ", uPh=" + uPh + ", uMail=" + uMail + ", uAddr=" + uAddr
				+ ", uPass=" + uPass + "]";
//		String table = String.format("|  %-4d | %-5s | %-9s | %-15s | %-13s | %-9s |\n", uId, uName, uPh, uMail, uAddr, uPass);
//	    return table;
	}	
}