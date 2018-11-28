package com.zzxtit.shop.manager.user.service;

import com.zzxtit.shop.manager.user.dao.QueryUserDao;
import com.zzxtit.shop.manager.user.entity.User;

public class QueryUserService {

	private QueryUserDao qud = new QueryUserDao(); 
	
	public User queryUser(String userName,String telephone) {
		User user = qud.queryUser(userName, telephone);
		return user;
	}
}
