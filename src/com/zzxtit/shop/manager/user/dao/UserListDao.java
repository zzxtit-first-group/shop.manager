package com.zzxtit.shop.manager.user.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.zzxtit.shop.manager.common.util.DbUtil;
import com.zzxtit.shop.manager.user.entity.User;

public class UserListDao {

	private QueryRunner qr = new QueryRunner(DbUtil.getDataSource());
	
	public List<User> geEmployeeList(){
		String sql = "select * from user where userType='01'";
		try {
			return qr.query(sql, new BeanListHandler<User>(User.class));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
}
