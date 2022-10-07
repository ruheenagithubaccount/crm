package com.crm1.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crm1.entities.Billing;

public interface BillingRepository extends JpaRepository<Billing, Long> {

}
