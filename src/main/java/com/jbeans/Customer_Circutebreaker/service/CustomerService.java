package com.jbeans.Customer_Circutebreaker.service;

import com.jbeans.Customer_Circutebreaker.dto.Customer;
import com.jbeans.Customer_Circutebreaker.dto.Loan;
import com.jbeans.Customer_Circutebreaker.proxy.LoanProxy;
import com.jbeans.Customer_Circutebreaker.repository.CustomerRepo;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class CustomerService {
    @Autowired
    CustomerRepo custRepo;
    @Autowired
    LoanProxy loanProxy;

    @CircuitBreaker(name = "customerLoan", fallbackMethod = "fallback")
    public List<Customer> getAllCustomer() {
        List<Loan> loanList = loanProxy.getLoanlist();
        loanList.stream().forEach(System.out::println);
        return custRepo.findAll();
    }
    public List<Customer> fallback(Exception ex) {
        System.out.println("FallBack Method !!! ");

        return Stream.of(
                 new Customer(15565701, "Ferri", 698, "Spain", "Female", 39, 9, 161993.89,1,90212.38,3, "DIAMOND",514),
                new Customer(15565706, "Akobundu", 612, "Spain", "Male", 35, 1, 0.0,1,83256.26,2, "SILVER",298),
                new Customer(15565714, "Cattaneo", 601, "France", "Male", 47, 2, 64430.06,2,96517.97,3, "Gold",308))
                .collect(Collectors.toList());
    }
}
