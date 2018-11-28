package com.zzxtit.shop.manager.user.service;

import com.zzxtit.shop.manager.user.dao.UpdateUserDao;
import com.zzxtit.shop.manager.user.entity.User;

public class UpdateUserService {

	private UpdateUserDao uud = new UpdateUserDao();
	
	public boolean updateUser(Object o) {
		User user = new User();
		if(o instanceof User) {
			user = (User)o;
		}
		return uud.updateUser(user);
	}
}
