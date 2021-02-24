package com.test.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.test.demo.entity.User;
import com.test.demo.request.InputRequest;
import com.test.demo.service.UserService;


@RestController
@RequestMapping(value="user")
public class UserController {
	
	@Autowired
	private UserService service;

	@PostMapping(value = "/saveUser")
	public User saveUser(@RequestBody User user) {
		return service.addUser(user);
	}

	@GetMapping("/getUsers")
	public List<User> findAllUsers() {
		return service.getUsers();
	}

	@GetMapping("/getUserByAddress")
	public List<User> findUserByAddress(@RequestParam String address) {
		return service.getUserbyAddress(address);
	}

	@PostMapping(value="/remove/{id}")
	public String removeUser(@PathVariable Integer id) {
		service.deleteUser(id);
		return "successfuly Deleted User";
	}
}
