package com.zzxtit.shop.manager.order.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.zzxtit.shop.manager.order.entity.Order;
import com.zzxtit.shop.manager.order.service.OrderListService;
import com.zzxtit.shop.manager.order.service.QueryOrderListService;

@WebServlet("/juery.do")
public class QueryOrderListServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7897963519235893899L;
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("UTF-8");
		String value = request.getParameter("value");
		int index = Integer.parseInt(value);
		if(index<4) {
			QueryOrderListService qols = new QueryOrderListService();
			String []mn = {"Pay","Send","Receive","Comment"};
			Object o = qols.getOrderList("0",mn[index]);
			List<Order> orderList = new ArrayList<Order>();
			if(o != null) {
				orderList = (List<Order>)o;
			}
			response.getWriter().write(new Gson().toJson(orderList));
		}else {
			OrderListService ols = new OrderListService();
			response.getWriter().write(new Gson().toJson(ols.getOrderList()));
		}
	}
}
