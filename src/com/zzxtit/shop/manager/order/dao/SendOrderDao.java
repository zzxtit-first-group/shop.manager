package com.zzxtit.shop.manager.order.dao;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;

import com.zzxtit.shop.manager.common.util.DbUtil;


public class SendOrderDao {

	private QueryRunner qr = new QueryRunner(DbUtil.getDataSource());
	
	public boolean updateOrder(String orderId) {
		String sql = "update orderinfo set is_send='1' where order_id='"+orderId+"'";
		try {
			if(qr.update(sql)>0) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
}
