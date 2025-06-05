package com.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.model.OrderInfo;

@Repository
public class OrderDaoImpl {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    private static final String INSERT_ORDER_QUERY = "INSERT INTO practice.orders (order_id, user_email_id, user_id, user_phone, order_status, order_payment_status, course_id) "
                                                    + "VALUES (?, ?, ?, ?, ?, ?, ?)";

    public void createOrder(OrderInfo orderInfo) {
    	
        jdbcTemplate.update(INSERT_ORDER_QUERY, 
                            orderInfo.getOrderId(), 
                            orderInfo.getUserEmailId(), 
                            orderInfo.getUserId(), 
                            orderInfo.getUserPhone(), 
                            orderInfo.isOrderStatus(), 
                            orderInfo.isOrderPaymentStatus(), 
                            orderInfo.getCourseId());
    }
}

