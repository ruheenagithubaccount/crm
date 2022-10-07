package com.crm1.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crm1.entities.Lead;

public interface LeadRepository extends JpaRepository<Lead, Long> {

}
