package com.test.demo.controller;

import com.test.demo.CustomerAlertSubscription;
import com.test.demo.repository.DataRepository;
import org.springframework.beans.factory.annotation.Autowired;
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
}
