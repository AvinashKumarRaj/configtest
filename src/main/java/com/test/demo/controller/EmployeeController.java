package com.test.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.demo.entity.Response;
import com.test.demo.repository.EmployeeRepository;
import com.test.demo.entity.Employee;


@RestController
@RequestMapping(value="/employeeService")
public class EmployeeController {
	
	@Autowired
	private EmployeeRepository repository;

	@PostMapping(value="/addEmployee")
	public Response addEmployee(@RequestBody Employee emp) {
		Response response=new Response();
		try {
			repository.save(emp);
			response.setMessage(emp.getId() + " inserted");
			response.setStatus(Boolean.TRUE);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return response;
	}

	@GetMapping(value="/getEmployees")
	public Response getAllEmployees() {
		Response response=new Response();
		try {
			List<Employee> employees = repository.findAll();
			response.setMessage("record counts : " + employees.size());
			response.setStatus(Boolean.TRUE);
		} catch (Exception e) {
			e.printStackTrace();
		}		
		return response;
	}
}
