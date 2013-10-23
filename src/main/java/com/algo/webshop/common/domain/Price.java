package com.algo.webshop.common.domain;

import java.io.Serializable;
import java.util.Calendar;

public class Price implements Serializable {

	private static final long serialVersionUID = -2925889698292451839L;
	private int id;
	private int goodId;
	private float value;
	private Calendar calendar;

	public Price() {
	}

	public Price(int goodId, float value) {
		super();
		this.goodId = goodId;
		this.value = value;
		this.calendar = Calendar.getInstance();
	}

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

	public Calendar getCalendar() {
		return calendar;
	}

	public void setCalendar(Calendar calendar) {
		this.calendar = calendar;
	}
	
}
