package com.zzxtit.shop.manager.user.dao;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import com.zzxtit.shop.manager.common.util.DbUtil;
import com.zzxtit.shop.manager.user.entity.User;

public class LoginDao {

	private QueryRunner qr = new QueryRunner(DbUtil.getDataSource()); 
	
	public User login(String userName) {
		String sql = "select * from user where userName='"+userName+"'";
		try {
			return qr.query(sql, new BeanHandler<User>(User.class));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
}
