package com.test.demo.service;

import java.util.List;

import com.test.demo.entity.User;
import com.test.demo.request.InputRequest;

public interface UserService {

	public User addUser(InputRequest inputRequest);
	public List<User> getUsers();
	public List<User> getUserbyAddress(String address);
	public String deleteUser(Integer id);
}