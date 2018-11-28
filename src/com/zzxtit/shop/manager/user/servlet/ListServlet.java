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

@WebServlet("/list")
public class ListServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5543709668060374676L;
	
	private UserListService uls = new UserListService();

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<User> userList =  uls.getEmployeeList();
		request.setAttribute("userList", userList);
		request.getRequestDispatcher("jsp/user/list.jsp").forward(request, response);
	}
}
