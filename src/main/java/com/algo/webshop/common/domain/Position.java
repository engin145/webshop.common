package com.algo.webshop.common.domain;

import java.io.Serializable;

public class Position implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4079223866086869619L;
	private int goods_id;
	private float amount;
	private float price;

	public Position(int goods_id, float amount, float price) {
		super();
		this.goods_id = goods_id;
		this.amount = amount;
		this.price = price;
	}

	public Position() {

	}

	public int getGoods_id() {
		return goods_id;
	}

	public float getAmount() {
		return amount;
	}

	public float getPrice() {
		return price;
	}

	public void setGoods_id(int goods_id) {
		this.goods_id = goods_id;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	public void setPrice(float price) {
		this.price = price;
	}

}
