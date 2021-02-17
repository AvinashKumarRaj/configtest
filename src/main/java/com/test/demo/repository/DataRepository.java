package com.test.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.demo.entity.CustomerAlertSubscription;

@Repository
public interface DataRepository extends JpaRepository<CustomerAlertSubscription, String> {
}
