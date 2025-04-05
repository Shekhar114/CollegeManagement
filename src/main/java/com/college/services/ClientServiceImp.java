package com.college.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.college.entities.Client;
import com.college.repository.ClientRepository;

@Service
public class ClientServiceImp implements ClientService{
	
	@Autowired
	ClientRepository clientRepository;
	@Override
	public Client saveData(Client client) {
		
		return clientRepository.save(client);
	}

}
