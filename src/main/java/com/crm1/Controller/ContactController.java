package com.crm1.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.crm1.Services.ContactService;
import com.crm1.entities.Contact;

@Controller
public class ContactController {

	@Autowired
	private ContactService contactService;
	
	@RequestMapping("/listContacts")
	public String ListContacts(ModelMap model) {
		List<Contact> contacts=contactService.getAllContacts();
		model.addAttribute("contacts", contacts);
		return"list_contacts";
	
	}
	

}
