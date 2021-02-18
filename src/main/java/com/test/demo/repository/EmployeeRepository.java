package com.test.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.demo.entity.Employee;
import com.test.demo.request.InputRequest;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	void save(InputRequest inputRequest);

}
