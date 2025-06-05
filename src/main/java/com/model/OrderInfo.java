package com.model;


public class OrderInfo {

	private String orderId;
	private String userId;
	private String userEmailId;
	private String userPhone;
	private boolean orderStatus;
	private String courseId;
	public OrderInfo() {
	}
	public String getOrderId() {
		return orderId;
	}
	public String getCourseId() {
		return courseId;
	}
	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserEmailId() {
		return userEmailId;
	}
	public void setUserEmailId(String userEmailId) {
		this.userEmailId = userEmailId;
	}
	public String getUserPhone() {
		return userPhone;
	}
	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}
	public boolean isOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(boolean orderStatus) {
		this.orderStatus = orderStatus;
	}
	public boolean isOrderPaymentStatus() {
		return orderPaymentStatus;
	}
	public void setOrderPaymentStatus(boolean orderPaymentStatus) {
		this.orderPaymentStatus = orderPaymentStatus;
	}
	@Override
	public String toString() {
		return "OrderInfo [orderId=" + orderId + ", userId=" + userId + ", userEmailId=" + userEmailId + ", userPhone="
				+ userPhone + ", orderStatus=" + orderStatus + ", courseId=" + courseId + ", orderPaymentStatus="
				+ orderPaymentStatus + "]";
	}
	private boolean orderPaymentStatus=false;
	
	
	
}
