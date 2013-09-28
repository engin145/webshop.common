package com.algo.webshop.common.domainimpl;

import java.util.Calendar;
import java.util.Set;

import com.algo.webshop.common.domain.Order;

public interface IOrder {
	public Order getOrder(int id);

	public Order getOrder(String number);

	public Set<Order> getOrderUser(int users_id);

	public Set<Order> getOrders();

	public Set<Order> getOrders(Calendar dateFrom, Calendar dateTo,
			int status_pay, int status_release, int status_cansel,
			int status_confirm);

	public void addOrder(Order order);

	public void updateOrder(Order order);

}
