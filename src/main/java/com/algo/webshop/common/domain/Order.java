package com.algo.webshop.common.domain;

import java.io.Serializable;
import java.util.Calendar;

public class Order implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -619959601108922801L;
	private int id;
	private String number;
	private int users_id;
	private String phone;
	private String email;
	private Calendar date_order;
	private Calendar date_pay;
	private Calendar date_release;
	private int cansel_status;
	private int confirm_status;
	private GoodsList goodList;

	public Order() {

	}

	public Order(int id, String number, int users_id, String phone,
			String email, Calendar date_order, Calendar date_pay,
			Calendar date_release, int cansel_status, int confirm_status) {
		super();
		this.id = id;
		this.number = number;
		this.users_id = users_id;
		this.phone = phone;
		this.email = email;
		this.date_order = date_order;
		this.date_pay = date_pay;
		this.date_release = date_release;
		this.cansel_status = cansel_status;
		this.confirm_status = confirm_status;
	}

	public Order(String number, String phone, String email,
			Calendar date_order, GoodsList goodList) {
		this.number = number;
		this.phone = phone;
		this.email = email;
		this.date_order = date_order;
		this.goodList = goodList;
	}

	public Order(String number, int users_id, Calendar date_order,
			GoodsList goodList) {
		this.number = number;
		this.users_id = users_id;
		this.date_order = date_order;
		this.goodList = goodList;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public int getUsers_id() {
		return users_id;
	}

	public void setUsers_id(int users_id) {
		this.users_id = users_id;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Calendar getDate_order() {
		return date_order;
	}

	public void setDate_order(Calendar date_order) {
		this.date_order = date_order;
	}

	public Calendar getDate_pay() {
		return date_pay;
	}

	public void setDate_pay(Calendar date_pay) {
		this.date_pay = date_pay;
	}

	public Calendar getDate_release() {
		return date_release;
	}

	public void setDate_release(Calendar date_release) {
		this.date_release = date_release;
	}

	public int getCansel_status() {
		return cansel_status;
	}

	public void setCansel_status(int cansel_status) {
		this.cansel_status = cansel_status;
	}

	public int getConfirm_status() {
		return confirm_status;
	}

	public void setConfirm_status(int confirm_status) {
		this.confirm_status = confirm_status;
	}

	public GoodsList getGoodList() {
		return goodList;
	}

	public void setGoodList(GoodsList goodList) {
		this.goodList = goodList;
	}

}
