package com.zzxtit.shop.manager.user.service;

import com.zzxtit.shop.manager.user.dao.AddUserDao;
import com.zzxtit.shop.manager.user.entity.User;

public class AddUserService {

	private AddUserDao aud = new AddUserDao();
	
	public boolean addUser(Object o) {
		User user = new User();
		if(o instanceof User) {
			user = (User)o;
		}
		return aud.addUser(user);
	}
}
