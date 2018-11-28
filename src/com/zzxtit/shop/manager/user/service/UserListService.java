package com.zzxtit.shop.manager.user.service;

import java.util.List;

import com.zzxtit.shop.manager.user.dao.UserListDao;
import com.zzxtit.shop.manager.user.entity.User;

public class UserListService {

	private UserListDao uld = new UserListDao();
	
	private List<User> userList = null;
	
	public List<User> getEmployeeList(){
		userList = uld.geEmployeeList();
		if(userList != null){
			return userList;
		}
		return null;
	}
}
