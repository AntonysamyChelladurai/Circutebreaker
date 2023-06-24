package com.jbeans.Customer_Circutebreaker.controller;

import com.jbeans.Customer_Circutebreaker.dto.Customer;
import com.jbeans.Customer_Circutebreaker.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Customer")
public class CustomerDetails {

    @Autowired
    CustomerService customerService;
    @GetMapping("/allCustomer")
    public List<Customer> getAllCustomer(){
        return customerService.getAllCustomer();
    }
}
