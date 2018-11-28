package com.zzxtit.shop.manager.order.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zzxtit.shop.manager.order.entity.Order;
import com.zzxtit.shop.manager.order.service.QueryOrderListService;

@WebServlet("/send.do")
public class isSendServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6698357223631708890L;

	private QueryOrderListService qols = new QueryOrderListService();
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Object o = qols.getOrderList("1", "Send");
		List<Order> orderList = new ArrayList<Order>();
		if(o != null) {
			orderList = (List<Order>)o;
		}
		request.setAttribute("orderList", orderList);
		request.getRequestDispatcher("jsp/order/isSend.jsp").forward(request, response);
	}
}
