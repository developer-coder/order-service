package com.service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.OrderDaoImpl;
import com.model.OrderInfo;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
    private OrderDaoImpl orderInfoDao;
	
	@Override
	public OrderInfo createOrder()
	{
		OrderInfo orderInfo=new OrderInfo();
		
		orderInfo.setOrderId(UUID.randomUUID().toString());
		orderInfo.setUserEmailId("xyz@gmail.com");
		orderInfo.setUserId("123");
		orderInfo.setUserPhone("999999");
		orderInfo.setOrderStatus(false);
		orderInfo.setOrderPaymentStatus(false);
		orderInfo.setCourseId("345");
		orderInfoDao.createOrder(orderInfo);
		return orderInfo;
	}
}
