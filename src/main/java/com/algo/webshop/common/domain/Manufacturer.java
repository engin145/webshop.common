package com.algo.webshop.common.domain;

import java.io.Serializable;

public class Manufacturer implements Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7711799346715880786L;
	private int id;
	private String name;

	public Manufacturer() {

	}

	public Manufacturer(int id, String name) {
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
