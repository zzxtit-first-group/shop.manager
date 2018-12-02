package com.zzxtit.shop.manager.order.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zzxtit.shop.manager.order.service.SendOrderService;

@WebServlet("/sendOrder")
public class SendOrderServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4782078246620643576L;
	private SendOrderService sos = new SendOrderService();
	private isNotSendServlet inss = new isNotSendServlet();
	
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String orderId = request.getParameter("orderId");
		sos.updateOrderSendStaus(orderId);
		inss.service(request, response);
	}
}
