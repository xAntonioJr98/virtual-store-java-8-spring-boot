package com.torresantonio.virtualstore.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.torresantonio.virtualstore.entities.Client;
import com.torresantonio.virtualstore.entities.Order;
import com.torresantonio.virtualstore.entities.Product;
import com.torresantonio.virtualstore.repositories.ClientRepository;
import com.torresantonio.virtualstore.repositories.OrderRepository;
import com.torresantonio.virtualstore.repositories.ProductRepository;

//database seeding

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private ClientRepository clientRepository;
	
	@Autowired
	private OrderRepository orderRepository;
	
	@Autowired
	private ProductRepository productRepository;

	@Override
	public void run(String... args) throws Exception {
		Client cli1 = new Client(null, "Antonio", "antonio@gmail.com", "51515151", "123");
		Client cli2 = new Client(null, "Carlos", "carlos@gmail.com", "52525252", "321");
		
		Order ord1 = new Order(1L, "Camiseta", 19.90, cli1 );
		Order ord2 = new Order(2L, "Bermuda", 49.90, cli2 );
		
		Product prod1 = new Product(1L, "Bermuda", "Roupas",49.90, "teste");
		Product prod2 = new Product(2L, "Camiseta", "Roupas",19.90, "teste");
		Product prod3 = new Product(3L, "Bone", "Roupas",89.90, "teste");
		
		clientRepository.saveAll(Arrays.asList(cli1, cli2));
		orderRepository.saveAll(Arrays.asList(ord1, ord2));
		productRepository.saveAll(Arrays.asList(prod1, prod2, prod3));
		
		
		

	}

}
