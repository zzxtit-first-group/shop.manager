package com.zzxtit.shop.manager.user.dao;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;

import com.zzxtit.shop.manager.common.util.DbUtil;
import com.zzxtit.shop.manager.user.entity.User;

public class AddUserDao {

	private QueryRunner qr = new QueryRunner(DbUtil.getDataSource());
	
	public boolean addUser(User user) {
		String sql = "insert into user (userCode,userName,password,realName,sex,address,telephone,idCard,userType) values(?,?,?,?,?,?,?,?,?)";
		Object []params = {user.getUserCode(),user.getUserName(),user.getPassword(),user.getRealName(),user.getSex(),user.getAddress(),user.getTelephone(),user.getIdCard(),user.getUserType()};
		try {
			if(qr.update(sql, params)>0) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
}
