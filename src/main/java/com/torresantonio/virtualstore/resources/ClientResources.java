package com.torresantonio.virtualstore.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.torresantonio.virtualstore.entities.Client;

@RestController
@RequestMapping(value="/clients")
public class ClientResources {
		
	
		@GetMapping
		public ResponseEntity <List<Client>> findAll(){
			Client cli1 = new Client(null, "Antonio", "antonio@gmail.com", "51515151", "123");
			Client cli2 = new Client(null, "Carlos", "carlos@gmail.com", "52525252", "321");
			List<Client> list = new ArrayList<>();
			list.addAll(Arrays.asList(cli1, cli2));
			return ResponseEntity.ok().body(list);
			
		}
}
