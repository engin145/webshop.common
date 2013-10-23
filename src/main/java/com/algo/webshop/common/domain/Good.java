package com.algo.webshop.common.domain;

import java.io.Serializable;

public class Good implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8004309032842218295L;
	private int id;
	private String name;
	private String description;
	private int category_id;
	private int manufacturers_id;
	private float amount;
	private int units_id;

	public Good() {

	}

	public Good(int id, String name, String description, int category_id,
			int manufacturers_id, float amount, int units_id) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.category_id = category_id;
		this.manufacturers_id = manufacturers_id;
		this.amount = amount;
		this.units_id = units_id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getCategory_id() {
		return category_id;
	}

	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	}

	public int getManufacturers_id() {
		return manufacturers_id;
	}

	public void setManufacturers_id(int manufacturers_id) {
		this.manufacturers_id = manufacturers_id;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	public int getUnits_id() {
		return units_id;
	}

	public void setUnits_id(int units_id) {
		this.units_id = units_id;
	}

}
