package com.test.demo.service;

import java.util.List;

import com.test.demo.entity.User;

public interface UserService {

	public User addUser(User user);
	public List<User> getUsers();
	public List<User> getUserbyAddress(String address);
	public String deleteUser(Integer id);
}
