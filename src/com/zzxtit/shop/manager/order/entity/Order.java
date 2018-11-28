package com.zzxtit.shop.manager.order.entity;

import java.util.Date;

public class Order {
	
	private String orderId;
	
	private Date orderTime;
	
	private int isPay;
	
	private int isSend;
	
	private int isReceive;
	
	private int isComment;
	
	private int isDel;
	
	private String userId;

	public String getOrderId() {
		return orderId;
	}

	public Date getOrderTime() {
		return orderTime;
	}

	public int getIsPay() {
		return isPay;
	}

	public int getIsSend() {
		return isSend;
	}

	public int getIsReceive() {
		return isReceive;
	}

	public int getIsComment() {
		return isComment;
	}

	public int getIsDel() {
		return isDel;
	}

	public String getUserId() {
		return userId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public void setOrderTime(Date orderTime) {
		this.orderTime = orderTime;
	}

	public void setIsPay(int isPay) {
		this.isPay = isPay;
	}

	public void setIsSend(int isSend) {
		this.isSend = isSend;
	}

	public void setIsReceive(int isReceive) {
		this.isReceive = isReceive;
	}

	public void setIsComment(int isComment) {
		this.isComment = isComment;
	}

	public void setIsDel(int isDel) {
		this.isDel = isDel;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	
}
