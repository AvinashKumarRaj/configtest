package com.test.demo;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.test.demo.entity.Employee;
import com.test.demo.entity.Response;
import com.test.demo.request.InputRequest;

@RunWith(SpringRunner.class)
@SpringBootTest
 class SpringMockitoApplicationTests {

	private MockMvc mockMvc;
	@Autowired
	private WebApplicationContext context;

	ObjectMapper om = new ObjectMapper();

	@BeforeEach
	 void setUp() {
		mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
	}

	@Test
	 void addEmployeeTest() throws Exception {
		InputRequest request = new InputRequest();
		Employee employee=request.getRequestData().getEmployee();
		employee.setName("rahul");
		employee.setDept("IT");
		String jsonRequest = om.writeValueAsString(employee);
		MvcResult result = mockMvc.perform(post("/employeeService/addEmployee").content(jsonRequest)
				.contentType(MediaType.APPLICATION_JSON_VALUE)).andExpect(status().isOk()).andReturn();
		String resultContent = result.getResponse().getContentAsString();
		Response response = om.readValue(resultContent, Response.class);
		Assert.assertTrue(response.isStatus() == Boolean.TRUE);
	}

	@Test
	 void getEmployeesTest() throws Exception {
		MvcResult result = mockMvc
				.perform(get("/employeeService/getEmployees").content(MediaType.APPLICATION_JSON_VALUE))
				.andExpect(status().isOk()).andReturn();
		String resultContent = result.getResponse().getContentAsString();
		Response response = om.readValue(resultContent, Response.class);
		System.out.println("getting data from db  "+response);
		Assert.assertTrue(response.isStatus() == Boolean.TRUE);

	}

}
