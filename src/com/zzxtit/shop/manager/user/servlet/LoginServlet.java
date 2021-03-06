package com.zzxtit.shop.manager.user.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.zzxtit.shop.manager.common.pojo.ResMessage;
import com.zzxtit.shop.manager.user.service.LoginService;

@WebServlet("/login.do")
public class LoginServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1820393607935836797L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("UTF-8");
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		ResMessage rm = new LoginService().loginMessage(userName, password);
		request.getSession().setAttribute("resMsg", rm);
		response.getWriter().write(new Gson().toJson(rm));
	}
}
