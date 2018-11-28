package com.zzxtit.shop.manager.user.dao;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;

import com.zzxtit.shop.manager.common.util.DbUtil;
import com.zzxtit.shop.manager.user.entity.User;

public class UpdateUserDao {

	private QueryRunner qr = new QueryRunner(DbUtil.getDataSource());
	
	public boolean updateUser(User user) {
		String sql = "update user set userName=?,password=?,realName=?,sex=?,address=?,telephone=?,idCard=?,userType=? where userCode='"+user.getUserCode()+"'";
		Object []params = {user.getUserName(),user.getPassword(),user.getRealName(),user.getSex(),user.getAddress(),user.getTelephone(),user.getIdCard(),user.getUserType()};
		try {
			if(qr.update(sql,params)>0) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return false;
	}
	
}
