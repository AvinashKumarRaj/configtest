package com.test.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.demo.entity.User;
import com.test.demo.request.InputRequest;


@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
	
	List<User> findByAddress(String address);
	public void deleteById(Integer id);
	User save(InputRequest inputRequest);

}
