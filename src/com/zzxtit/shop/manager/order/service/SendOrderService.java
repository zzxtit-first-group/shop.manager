package com.zzxtit.shop.manager.order.service;

import com.zzxtit.shop.manager.order.dao.SendOrderDao;

public class SendOrderService {

	private SendOrderDao sod = new SendOrderDao();
	
	public boolean updateOrderSendStaus(String orderId) {
		return sod.updateOrder(orderId);
	}
}
