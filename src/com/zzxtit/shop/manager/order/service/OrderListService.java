package com.zzxtit.shop.manager.order.service;

import java.util.List;

import com.zzxtit.shop.manager.order.dao.OrderListDao;
import com.zzxtit.shop.manager.order.entity.Order;

public class OrderListService {

	private OrderListDao old = new OrderListDao();
	
	public List<Order> getOrderList(){
		return old.getOrderList();
	}
}
