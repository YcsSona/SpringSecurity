package com.theonewhocode.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id")
    private int id;

    private String name;

    private String email;

    private String mobileNumber;

    private String pwd;

    private String role;

    private String createDt;

}
