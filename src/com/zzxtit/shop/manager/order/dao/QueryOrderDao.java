package com.zzxtit.shop.manager.order.dao;

import java.sql.SQLException;
import java.util.List;
import java.util.Set;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.zzxtit.shop.manager.common.util.DbUtil;
import com.zzxtit.shop.manager.order.entity.Order;

public class QueryOrderDao {

	private QueryRunner qr = new QueryRunner(DbUtil.getDataSource());
	
	public Order queryOrderByOrderId(String orderId) {
		String sql ="select order_id orderId, order_time orderTime, is_pay isPay, is_send isSend, "
				+"is_receive isReceive, is_comment isComment, is_del isDel, user_id userId from orderinfo where order_id='"+orderId+"'";
		try {
			return qr.query(sql, new BeanHandler<Order>(Order.class));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public List<Order> queryOrderByPay(String isNotPay) {
		String sql ="select order_id orderId, order_time orderTime, is_pay isPay, is_send isSend, "
				+"is_receive isReceive, is_comment isComment, is_del isDel, user_id userId from orderinfo where is_pay='"+isNotPay+"'";
		try {
			return qr.query(sql, new BeanListHandler<Order>(Order.class));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public List<Order> queryOrderBySend(String isNotSend) {
		String sql ="select order_id orderId, order_time orderTime, is_pay isPay, is_send isSend, "
				+"is_receive isReceive, is_comment isComment, is_del isDel, user_id userId from orderinfo where is_send='"+isNotSend+"' and is_pay='1'";
		try {
			return qr.query(sql, new BeanListHandler<Order>(Order.class));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	
	public List<Order> queryOrderByReceive(String isNotReceive) {
		String sql ="select order_id orderId, order_time orderTime, is_pay isPay, is_send isSend, "
				+"is_receive isReceive, is_comment isComment, is_del isDel, user_id userId from orderinfo where is_receive='"+isNotReceive+"' and is_send='1'";
		try {
			return qr.query(sql, new BeanListHandler<Order>(Order.class));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public List<Order> queryOrderByComment(String isNotComment) {
		String sql ="select order_id orderId, order_time orderTime, is_pay isPay, is_send isSend, "
				+"is_receive isReceive, is_comment isComment, is_del isDel, user_id userId from orderinfo where is_comment='"+isNotComment+"' and is_receive='1'";
		try {
			return qr.query(sql, new BeanListHandler<Order>(Order.class));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public List<Order> queryOrderByUserId(String userId) {
		String sql ="select order_id orderId, order_time orderTime, is_pay isPay, is_send isSend, "
				+"is_receive isReceive, is_comment isComment, is_del isDel, user_id userId from orderinfo where user_id='"+userId+"'";
		try {
			return qr.query(sql, new BeanListHandler<Order>(Order.class));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
}
