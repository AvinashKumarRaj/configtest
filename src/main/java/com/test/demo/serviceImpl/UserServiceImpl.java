package com.test.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.demo.entity.User;
import com.test.demo.repository.UserRepository;
import com.test.demo.request.InputRequest;
import com.test.demo.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository repository;

	@Override
	public User addUser(InputRequest inputRequest) {
		User user=inputRequest.getRequestData().getUser();
	    repository.save(user);
		return user;
	}

	@Override
	public List<User> getUsers() {
		List<User> users = repository.findAll();
		System.out.println("Getting data from DB : " + users);
		return users;
	}

	@Override
	public List<User> getUserbyAddress(String address) {
		return repository.findByAddress(address);
	}

	@Override
	public String deleteUser(Integer id) {
		repository.deleteById(id);
		
		return "successfuly Deleted User";
		
	}

}
