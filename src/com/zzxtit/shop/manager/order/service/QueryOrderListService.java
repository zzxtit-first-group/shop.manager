package com.zzxtit.shop.manager.order.service;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.zzxtit.shop.manager.order.dao.QueryOrderDao;

public class QueryOrderListService {

	private QueryOrderDao qod = new QueryOrderDao();
	
	public Object getOrderList(String param,String mn){
		try {
			Method method = qod.getClass().getMethod("queryOrderBy"+mn, String.class);
			return method.invoke(qod, param);
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		return null;
	}
}
