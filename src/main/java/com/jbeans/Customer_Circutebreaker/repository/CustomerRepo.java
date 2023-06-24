package com.jbeans.Customer_Circutebreaker.repository;

import com.jbeans.Customer_Circutebreaker.dto.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepo extends JpaRepository<Customer,Long> {
}
