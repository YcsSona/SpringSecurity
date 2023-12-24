package com.theonewhocode.repository;

import com.theonewhocode.model.Customer;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends ListCrudRepository<Customer, Integer> {

    List<Customer> findByEmail(String email);
}
