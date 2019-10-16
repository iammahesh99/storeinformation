package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class Store {
	
	@Id
	private int sid;
	private String sname;
	private int stock_in_hand ;
	
	
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getStock_in_hand() {
		return stock_in_hand;
	}
	public void setStock_in_hand(int stock_in_hand) {
		this.stock_in_hand = stock_in_hand;
	}
	@Override
	public String toString() {
		return "Store [sid=" + sid + ", sname=" + sname + ", stock_in_hand=" + stock_in_hand + "]";
	}
	
}
