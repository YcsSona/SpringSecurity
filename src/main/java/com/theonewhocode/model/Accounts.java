package com.theonewhocode.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Accounts {

    private int customerId;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long accountNumber;

    private String accountType;

    private String branchAddress;

    private String createDt;
}
