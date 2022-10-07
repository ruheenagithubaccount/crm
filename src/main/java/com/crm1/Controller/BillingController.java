package com.crm1.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.crm1.Services.BillingService;
import com.crm1.Services.ContactService;
import com.crm1.entities.Billing;
import com.crm1.entities.Contact;

@Controller
public class BillingController {

	@Autowired
	private ContactService contactService;
	
	@Autowired
	private BillingService billingService;
	
	
	
	@RequestMapping("/generateBill")
public String getContactId(@RequestParam("id") long id,ModelMap model){
		Contact contact=contactService.getOneContact(id);
		model.addAttribute("contact", contact);
		return"generate_bill";
}
	@RequestMapping("/saveBill")
	public String SaveBill(@ModelAttribute("bill") Billing bill) {
		billingService.saveBill(bill);
		return"generate_bill";
	}
	

}