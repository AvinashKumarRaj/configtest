package com.test.demo.controller;

import com.test.demo.entity.CustomerAlertSubscription;
import com.test.demo.repository.DataRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DataController {

    @Autowired
    private DataRepository dataRepository;
    
	private static Logger logger = LoggerFactory.getLogger(DataController.class);


    @GetMapping(value="/value")
    public List<CustomerAlertSubscription> findData() {
        return dataRepository.findAll();
    }
    
    
    @GetMapping(value = "/check")
    public ResponseEntity<Object> check()
    {
    	logger.error("logger testing");
    	return new ResponseEntity<>("Ok",HttpStatus.OK);
    }
}
