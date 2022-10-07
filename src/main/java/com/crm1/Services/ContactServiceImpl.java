package com.crm1.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crm1.Repositories.ContactRepository;
import com.crm1.entities.Contact;

@Service
public class ContactServiceImpl implements ContactService {

	@Autowired
	private ContactRepository contactRepo;
	
	
	@Override
	public void saveOneContact(Contact contact) {
		contactRepo.save(contact);
	}


	@Override
	public List<Contact> getAllContacts() {
		List<Contact> contacts = contactRepo.findAll()	;
		return contacts;
	}


	@Override
	public Contact getOneContact(long id) {
		Optional<Contact> findById = contactRepo.findById(id);
		Contact contact = findById.get();
		return contact;
	}



	

}
