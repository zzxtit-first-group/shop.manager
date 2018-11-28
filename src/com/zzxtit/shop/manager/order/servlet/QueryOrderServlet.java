package com.zzxtit.shop.manager.order.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zzxtit.shop.manager.order.service.QueryOrderService;

@WebServlet("/queryOrder")
public class QueryOrderServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3604392284007056994L;
	
	private QueryOrderService qos = new QueryOrderService();

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("orderId", request.getParameter("orderId"));
		request.setAttribute("userId", request.getParameter("userId"));
		request.setAttribute("orderList", qos.getOrder(request));
		request.getRequestDispatcher("jsp/order/orderList.jsp").forward(request, response);
	}
}
