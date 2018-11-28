package com.zzxtit.shop.manager.order.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zzxtit.shop.manager.order.service.OrderListService;

@WebServlet("/orderList")
public class OrderListServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 417319328423408474L;
	
	private OrderListService ols = new OrderListService();

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("orderList", ols.getOrderList());
		request.getRequestDispatcher("jsp/order/orderList.jsp").forward(request, response);
	}
}
