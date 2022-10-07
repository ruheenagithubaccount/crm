package com.crm1.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crm1.entities.Contact;
public interface ContactRepository extends JpaRepository<Contact, Long> {

}
