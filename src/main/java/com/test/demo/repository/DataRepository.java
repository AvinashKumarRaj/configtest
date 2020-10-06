package com.test.demo.repository;

import com.test.demo.CustomerAlertSubscription;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DataRepository extends JpaRepository<CustomerAlertSubscription, String> {
}
