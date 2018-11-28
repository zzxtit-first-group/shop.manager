package com.zzxtit.shop.manager.user.dao;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import com.zzxtit.shop.manager.common.util.DbUtil;
import com.zzxtit.shop.manager.user.entity.User;

public class QueryUserDao {

	private QueryRunner qr = new QueryRunner(DbUtil.getDataSource());
	
	public User queryUserByUserCode(String userCode) {
		String sql = "select * from user where userCode='"+userCode+"'";
		try {
			return qr.query(sql, new BeanHandler<User>(User.class));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public User queryUserByUserName(String userName) {
		String sql = "select * from user where userName='"+userName+"' and userType='01'";
		try {
			return qr.query(sql, new BeanHandler<User>(User.class));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public User queryUserByTelephone(String telephone) {
		String sql = "select * from user where telephone='"+telephone+"' and userType='01'";
		try {
			return qr.query(sql, new BeanHandler<User>(User.class));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public User queryUser(String userName,String telephone) {
		if(!userName.equals("") && telephone.equals("")) {
			return queryUserByUserName(userName);
		}
		
		if(userName.equals("") && !telephone.equals("")) {
			return queryUserByTelephone(telephone);
		}
		if(userName.equals("") && telephone.equals("")) {
			return null;
		}
		String sql = "select * from user where userName='"+userName+"' and telephone='"+telephone+"'";
		try {
			return qr.query(sql, new BeanHandler<User>(User.class));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
}
