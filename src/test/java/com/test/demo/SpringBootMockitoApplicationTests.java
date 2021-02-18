package com.test.demo;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.test.demo.entity.User;
import com.test.demo.repository.UserRepository;
import com.test.demo.request.InputRequest;
import com.test.demo.service.UserService;


@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootMockitoApplicationTests {

	@Autowired
	private UserService service;

	@MockBean
	private UserRepository repository;

	@Test
	public void getUsersTest() {
		when(repository.findAll()).thenReturn(Stream
				.of(new User(1, "Saddam", 26, "jaunpur","saddam@gmail.com"), new User(2, "premchand", 30, "Mau","prem@gmail.com")).collect(Collectors.toList()));
		assertEquals(2, service.getUsers().size());
	}

	@Test
	public void getUserbyAddressTest() {
		String address = "Bihar";
		when(repository.findByAddress(address))
				.thenReturn(Stream.of(new User(30, "ankit", 28, "Raj Kumar","ankit@gmail.com")).collect(Collectors.toList()));
		assertEquals(1, service.getUserbyAddress(address).size());
	}

	@Test
	public void saveUserTest() {
		InputRequest inputRequest=new InputRequest();
		User user=inputRequest.getRequestData().getUser();
		user = new User(999, "Pranya", 33, "Pune","pranya@gmail.com");
		when(repository.save(user)).thenReturn(user);
		assertEquals(user, service.addUser(inputRequest));
	}

	@Test
	public void deleteUserTest() {
//		User user = new User(999, "Pranya", 33, "Pune","pranya@gmail.com");
		Integer id=7871;
		service.deleteUser(id);
		verify(repository, times(1)).deleteById(id);
	}

}
