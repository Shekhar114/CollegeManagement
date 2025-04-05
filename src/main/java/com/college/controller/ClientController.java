package com.college.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

import com.college.entities.Client;
import com.college.services.ClientServiceImp;


@Controller
public class ClientController {
	
	@Autowired
	ClientServiceImp clientServiceImp;
	
	@PostMapping("/enquiry")
	public Client saveClient(Client client, Model model) {
		
		model.addAttribute(client);
		return clientServiceImp.saveData(client);
		
	}

}
