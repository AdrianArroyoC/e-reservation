package com.adrianarroyoc.ereservation.controllers.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adrianarroyoc.ereservation.models.Client;

/**
 * Interface to define the bd operations related with the client
 * @author adrianarroyoc
 *
 */

public interface ClientRepository extends JpaRepository<Client, String>{
	
	/**
	 * Method definition for client search by the last name
	 * @param lastNameCli
	 * @return
	 */
	public List<Client> findByLastNameCli(String lastNameCli);
	
	// JPQL
	public Client findByIdentification(String identificationCli);
	
}
