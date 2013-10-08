package com.algo.webshop.common.domain;

import java.io.Serializable;

public class Basket implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2633092821227388746L;
	private int goodId;
	private String nameGood;
	private float value;
	private float price;
	
	public int getGoodId() {
		return goodId;
	}
	public void setGoodId(int goodId) {
		this.goodId = goodId;
	}
	public float getValue() {
		return value;
	}
	public void setValue(float value) {
		this.value = value;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getNameGood() {
		return nameGood;
	}
	public void setNameGood(String nameGood) {
		this.nameGood = nameGood;
	}
	
	

}
