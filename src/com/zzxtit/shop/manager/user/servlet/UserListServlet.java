package com.zzxtit.shop.manager.user.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zzxtit.shop.manager.user.entity.User;
import com.zzxtit.shop.manager.user.service.UserListService;

@WebServlet("/userlist")
public class UserListServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7607431925672451398L;
	
	private UserListService uls = new UserListService();

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<User> userList =  uls.getEmployeeList();
		request.setAttribute("userList", userList);
		request.getRequestDispatcher("jsp/user/userlist.jsp").forward(request, response);
	}
}
