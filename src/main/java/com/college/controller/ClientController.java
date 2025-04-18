package com.college.controller;


import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


import com.college.entities.Client;
import com.college.services.ClientService;



@Controller
public class ClientController {
	
	
	private ClientService clientService;
	public ClientController(ClientService clientService) {
		this.clientService = clientService;
	}
	
	@PostMapping("/enquiry")
	public String saveClient(@ModelAttribute Client client) {
		
//		System.out.println("Received form: " + client.getName() + ", " +
//	            client.getEmail());
////	        return "redirect:/success.html"; 
		clientService.saveData(client);
		return "client";
		
	}

}
