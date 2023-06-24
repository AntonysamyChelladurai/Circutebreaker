package com.jbeans.Customer_Circutebreaker.proxy;

import com.jbeans.Customer_Circutebreaker.dto.Loan;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Component
@FeignClient(name="currency-exchange",url = "http://localhost:8100/loan")
public interface LoanProxy {
    @GetMapping("/list")
    public List<Loan> getLoanlist();

}
