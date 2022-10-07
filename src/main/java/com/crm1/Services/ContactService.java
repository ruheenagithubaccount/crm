package com.crm1.Services;

import java.util.List;

import com.crm1.entities.Contact;

public interface ContactService {

	public void saveOneContact(Contact contact);
	public List<Contact> getAllContacts();
	public Contact getOneContact(long id);



}
