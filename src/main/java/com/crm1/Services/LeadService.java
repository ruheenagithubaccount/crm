package com.crm1.Services;

import java.util.List;

import com.crm1.entities.Lead;

public interface LeadService {

	public void saveOneLead(Lead lead);

	public Lead getOneLead(long id);

	public void deleteOneLead(long id);

	public List<Lead> listleads();



}
