package com.torresantonio.virtualstore.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.torresantonio.virtualstore.entities.Client;
import com.torresantonio.virtualstore.repositories.ClientRepository;

//database seeding

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private ClientRepository clientRepository;

	@Override
	public void run(String... args) throws Exception {
		Client cli1 = new Client(null, "Antonio", "antonio@gmail.com", "51515151", "123");
		Client cli2 = new Client(null, "Carlos", "carlos@gmail.com", "52525252", "321");
		
		clientRepository.saveAll(Arrays.asList(cli1, cli2));

	}

}
