package com.torresantonio.virtualstore.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.torresantonio.virtualstore.entities.Client;
import com.torresantonio.virtualstore.repositories.ClientRepository;

@Service
public class ClientService {
	
	@Autowired
	private ClientRepository repository;
	
	public List<Client> findAll(){
		return repository.findAll();
		
	}
	public Client findById(Long id) {
		Optional<Client> obj =  repository.findById(id);
		return obj.get();
		
	}
	public Client insert(Client obj) {
		return repository.save(obj);
	}
	public void delete(Long id) {
		repository.deleteById(id);
	}
}
