package com.test.demo;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

//import org.junit.Test;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.test.demo.entity.User;
import com.test.demo.repository.UserRepository;
import com.test.demo.service.UserService;


@RunWith(SpringRunner.class)
@SpringBootTest
 class SpringBootMockitoApplicationTests {

	@Autowired
	private UserService service;

	@MockBean
	private UserRepository repository;

	@Test
	 void getUsersTest() {
		when(repository.findAll()).thenReturn(Stream
				.of(new User(1, "Saddam", 26, "jaunpur","saddam@gmail.com"), new User(2, "premchand", 30, "Mau","prem@gmail.com")).collect(Collectors.toList()));
		assertEquals(2, service.getUsers().size());
	}

	@Test
	 void getUserbyAddressTest() {
		String address = "Bihar";
		when(repository.findByAddress(address))
				.thenReturn(Stream.of(new User(7871, "ankit", 30, "Bihar","ankit@gmail.com")).collect(Collectors.toList()));
		assertEquals(1, service.getUserbyAddress(address).size());
	}

	@Test
	 void saveUserTest() {
		 User user = new User(999, "Pranya", 33, "Pune","pranya@gmail.com");
		when(repository.save(user)).thenReturn(user);
		assertEquals(user, service.addUser(user));
	}

	@Test
	 void deleteUserTest() {
		Integer id=7871;
		service.deleteUser(id);
		verify(repository, times(1)).deleteById(id);
	}

}
