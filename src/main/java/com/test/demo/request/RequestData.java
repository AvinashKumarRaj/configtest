package com.test.demo.request;

import com.test.demo.entity.Employee;
import com.test.demo.entity.User;

public class RequestData {

	private Employee employee;
	private User user;
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	@Override
	public String toString() {
		return "InputRequest [employee=" + employee + ", user=" + user + "]";
	}
}
