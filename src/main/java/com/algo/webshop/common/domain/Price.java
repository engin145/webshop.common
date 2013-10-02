package com.algo.webshop.common.domain;

import java.io.Serializable;
import java.sql.Date;

public class Price implements Serializable {

	private static final long serialVersionUID = -7368659332561283999L;
	
	private int id;
	private int goodId;
	private float value;
	private Date date;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
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
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
}
