package com.zzxtit.shop.manager.user.dao;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;

import com.zzxtit.shop.manager.common.util.DbUtil;

public class DeleteUserDao {

	private QueryRunner qr = new QueryRunner(DbUtil.getDataSource());
	
	public boolean deleteUserByCode(String userCode) {
		String sql = "delete from user where userCode='"+userCode+"'";
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
