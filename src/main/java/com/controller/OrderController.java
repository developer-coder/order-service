package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.OrderInfo;
import com.service.OrderService;

@RestController
@RequestMapping("/api/v1/orders")
public class OrderController {
	
	@Autowired(required=true)
	OrderService orderService;
	
	@Autowired
	StreamBridge binding;
	
	@GetMapping("/get")
	public String getOrders()
	{
		return "Order received";
	}
	
	@PostMapping("/add")
	public ResponseEntity <String> createOrder()
	{
		OrderInfo order=orderService.createOrder();
		//orderCreateNotification(order);
		return ResponseEntity.ok("order created successfully");
	}

	private void orderCreateNotification(OrderInfo orderDetail) {
		System.out.println("inside orderCreateNotification");
		boolean send= binding.send("orderCreatedEvent-out-0", orderDetail);
		if(send)
			System.out.println("Order created and notification sent successfully");
		else
			System.out.println("Order created but notification not sent successfully");
		
	}

}
