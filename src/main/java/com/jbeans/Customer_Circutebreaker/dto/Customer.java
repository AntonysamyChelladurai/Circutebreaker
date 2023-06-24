package com.jbeans.Customer_Circutebreaker.dto;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "custid", nullable = false)
    private long custid;
    @Column(name="surname")
    private String surname;
    @Column(name="creditscore")
    private int creditscore;
    @Column(name="geography")
    private String geography;
    @Column(name="gender")
    private String gender;
    @Column(name="age")
    private int age;
    @Column(name="tenure")
    private int tenure;
    @Column(name="balance")
    private double balance;
    @Column(name="numofproducts")
    private int numofproducts;
    @Column(name="estimatedsalary")
    private double estimatedsalary;
    @Column(name="score")
    private int score;
    @Column(name="cardtype")
    private String cardtype;
    @Column(name="pointearned")
    private int pointearned;

    /*public Customer(int i, String ferri, int i1, String spain, String female, int i2, int i3, double v, int i4, double v1, int i5, String diamond, int i6) {
    }*/
}
