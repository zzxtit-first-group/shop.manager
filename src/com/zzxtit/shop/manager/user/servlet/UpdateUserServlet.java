package com.zzxtit.shop.manager.user.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zzxtit.shop.manager.common.util.FormUtil;
import com.zzxtit.shop.manager.user.entity.User;
import com.zzxtit.shop.manager.user.service.UpdateUserService;


@WebServlet("/update")
public class UpdateUserServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5353706918211708124L;

	private UpdateUserService uus = new UpdateUserService();
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		Object o = FormUtil.formToBean(request, User.class);
		boolean status = uus.updateUser(o);
		if(status) {
			request.getRequestDispatcher("jsp/user/updateSuccess.jsp").forward(request,response);
		}
		
	}
}
