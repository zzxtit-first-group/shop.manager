package com.zzxtit.shop.manager.user.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zzxtit.shop.manager.common.util.FormUtil;
import com.zzxtit.shop.manager.user.entity.User;
import com.zzxtit.shop.manager.user.service.AddUserService;

@WebServlet("/addUser")
public class AddUserServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8242694918158303309L;
	
	private AddUserService aus = new AddUserService();

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		Object o = FormUtil.formToBean(request, User.class);
		boolean status = aus.addUser(o);
		if(status) {
			request.getRequestDispatcher("jsp/user/success.jsp").forward(request,response);
		}
	}
}
