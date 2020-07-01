package com.torresantonio.virtualstore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.torresantonio.virtualstore.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {

}
