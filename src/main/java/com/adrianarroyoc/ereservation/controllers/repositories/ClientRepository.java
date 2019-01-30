package com.adrianarroyoc.ereservation.controllers.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adrianarroyoc.ereservation.models.Client;

/**
 * Interface to define the bd operations related with the client
 * @author adrianarroyoc
 *
 */

public interface ClientRepository extends JpaRepository<Client, String>{

}
