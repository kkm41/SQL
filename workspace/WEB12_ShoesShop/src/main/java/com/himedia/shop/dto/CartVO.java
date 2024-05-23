package com.himedia.shop.dto;

import java.sql.Timestamp;

public class CartVO {
	private int cseq;
	private String userid;
	private int pseq;
	private String mname;
	private String pname;
	private int quantity;
	private int price2;
	private Timestamp indate;
	
	public CartVO() {}
	
	
	
	
	public CartVO( int cseq, String userid, int pseq, String mname, String pname, int quantity, int price2 ) {
		super();
		this.cseq = cseq;
		this.userid = userid;
		this.pseq = pseq;
		this.mname = mname;
		this.pname = pname;
		this.quantity = quantity;
		this.price2 = price2;
		this.indate = indate;
	}
	
	public CartVO(int cseq, String userid, int pseq, String mname, String pname, int quantity, int price2,
			Timestamp indate) {
		super();
		this.cseq = cseq;
		this.userid = userid;
		this.pseq = pseq;
		this.mname = mname;
		this.pname = pname;
		this.quantity = quantity;
		this.price2 = price2;
		this.indate = indate;
	}
	public int getCseq() {
		return cseq;
	}
	public void setCseq(int cseq) {
		this.cseq = cseq;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public int getPseq() {
		return pseq;
	}
	public void setPseq(int pseq) {
		this.pseq = pseq;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getPrice2() {
		return price2;
	}
	public void setPrice2(int price2) {
		this.price2 = price2;
	}
	public Timestamp getIndate() {
		return indate;
	}
	public void setIndate(Timestamp indate) {
		this.indate = indate;
	}
	
	
}
