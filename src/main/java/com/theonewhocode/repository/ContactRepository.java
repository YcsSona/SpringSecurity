package com.theonewhocode.repository;

import com.theonewhocode.model.Contact;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepository extends ListCrudRepository<Contact, Long> {
}
