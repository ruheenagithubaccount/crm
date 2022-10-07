package com.crm1.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crm1.Repositories.BillingRepository;
import com.crm1.entities.Billing;

@Service
public class BillingServiceImpl implements BillingService {

	
	@Autowired
	private BillingRepository billingRepo;
	
	@Override
	public void saveBill(Billing bill) {
		billingRepo.save(bill);
	}

}
