package com.algo.webshop.common.domain;

import java.io.Serializable;

public class Unit implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6972394322383744108L;
	private int id;
	private String name;
	
	public Unit() {
		super();
	}

	public Unit(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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
	
}
