package com.algo.webshop.common.domainimpl;

import java.util.List;
import java.util.Set;

import com.algo.webshop.common.domain.Order;

public interface IOrder {
	public Order getOrderById(int id);

	public Order getOrder(String number);

	public Set<Order> getOrderUser(int users_id);

	public List<Order> getOrders(int confirmStatus, int canselStatus);

	public void addOrder(Order order);

	public void updateOrder(Order order);

	public String getLastOrderNumber();

	public int getOrderIdByNumber(String number);

}
