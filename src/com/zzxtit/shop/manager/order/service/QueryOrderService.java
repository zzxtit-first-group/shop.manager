package com.zzxtit.shop.manager.order.service;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.zzxtit.shop.manager.order.dao.QueryOrderDao;
import com.zzxtit.shop.manager.order.entity.Order;

public class QueryOrderService {

	private QueryOrderDao qod = new QueryOrderDao();
	
	public List<Order> getOrder(HttpServletRequest request){
		List<Order> orderList = new ArrayList<>();
		String orderId = request.getParameter("orderId");
		String userId = request.getParameter("userId");
		if(!orderId.equals("")) {
			orderList.add(qod.queryOrderByOrderId(orderId));
			return orderList;
		}else {
			return qod.queryOrderByUserId(userId);
		}
	}
}
