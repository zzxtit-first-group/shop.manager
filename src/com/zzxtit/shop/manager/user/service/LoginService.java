package com.zzxtit.shop.manager.user.service;

import com.zzxtit.shop.manager.common.pojo.ResMessage;
import com.zzxtit.shop.manager.user.dao.LoginDao;
import com.zzxtit.shop.manager.user.entity.User;

public class LoginService {

	private LoginDao ld = new LoginDao();
	
	private ResMessage rs = new ResMessage();
	
	public ResMessage loginMessage(String userName,String password) {
		User user= ld.login(userName);
		if(user != null) {
			if(user.getPassword().equals(password)) {
				rs.setResCode(200);
				rs.setData(user);
			}else {
				rs.setResCode(500);
				rs.setResMsg("密码错误!");
			}
		}else {
			rs.setResCode(404);
			rs.setResMsg("用户名不存在!");
		}
		return rs;
	}
}
