package com.algo.webshop.common.domain;

import java.io.Serializable;

public class Position implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4079223866086869619L;
	private final int goods_id;
	private final float amount;
	private final float price;
	
	public Position(int goods_id, float amount, float price) {
		super();
		this.goods_id = goods_id;
		this.amount = amount;
		this.price = price;
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

}
