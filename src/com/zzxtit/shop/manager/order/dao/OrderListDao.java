package com.zzxtit.shop.manager.order.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.zzxtit.shop.manager.common.util.DbUtil;
import com.zzxtit.shop.manager.order.entity.Order;

public class OrderListDao {
	
	private QueryRunner qr = new QueryRunner(DbUtil.getDataSource());
	
	public List<Order> getOrderList(){
		String sql ="select order_id orderId, order_time orderTime, is_pay isPay, is_send isSend, "
					+"is_receive isReceive, is_comment isComment, is_del isDel, user_id userId from t_order";
		try {
			return qr.query(sql, new BeanListHandler<Order>(Order.class));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
}
