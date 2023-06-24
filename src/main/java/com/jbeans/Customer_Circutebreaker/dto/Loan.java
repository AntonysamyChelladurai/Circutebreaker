package com.jbeans.Customer_Circutebreaker.dto;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Loan {
   /* @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "loan_id", nullable = false)*/
    long loan_id;
    //@Column(name="custid")
    long custid;
    //@Column(name="purpose")
    String purpose;
    //@Column(name="interest")
    float interest;
    //@Column(name="installment")
    long installment;
    //@Column(name="revolbal")
    double revolbal;
   // @Column(name="amount")
    long amount;
}
