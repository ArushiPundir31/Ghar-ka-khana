package com.gharkakhana.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gharkakhana.entity.Contact;
import com.gharkakhana.service.IContactService;

@RestController
@CrossOrigin
public class IContactController {
	@Autowired
	private IContactService iContactService;

	@PostMapping("/contact")
	public boolean contactUs(@RequestBody Contact contact, Model model) {
		return iContactService.saveMessage(contact);
	}

}
