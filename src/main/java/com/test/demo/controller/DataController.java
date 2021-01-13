package com.test.demo.controller;

import com.test.demo.CustomerAlertSubscription;
import com.test.demo.repository.DataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DataController {

    @Autowired
    private DataRepository dataRepository;

    @GetMapping(value="/value")
    public List<CustomerAlertSubscription> findData() {
        return dataRepository.findAll();
    }
    
    
    @GetMapping(value = "/check")
    public ResponseEntity<Object> check()
    {
    	return new ResponseEntity<>("success",HttpStatus.OK);
    }
}
