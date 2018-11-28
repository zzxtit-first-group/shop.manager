package com.zzxtit.shop.manager.user.servlet;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zzxtit.shop.manager.user.dao.QueryUserDao;
import com.zzxtit.shop.manager.user.entity.User;
import com.zzxtit.shop.manager.user.service.QueryUserService;

@WebServlet("/query")
public class QueryUserServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8220109242603905835L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		QueryUserDao qud = new QueryUserDao();
		String userCode = request.getParameter("userCode");
		User user = qud.queryUserByUserCode(userCode);
		request.setAttribute("user", user);
		request.getRequestDispatcher("jsp/user/updateUser.jsp").forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userName = request.getParameter("userName");
		String telephone = request.getParameter("telephone");
		List<User> userList = new LinkedList<User>();
		User user = new QueryUserService().queryUser(userName, telephone);
		if(user != null) {
			userList.add(user);
		}
		request.setAttribute("userName", userName);
		request.setAttribute("telephone", telephone);
		request.setAttribute("userList", userList);
		request.getRequestDispatcher("jsp/user/userlist.jsp").forward(request, response);
	}
}
