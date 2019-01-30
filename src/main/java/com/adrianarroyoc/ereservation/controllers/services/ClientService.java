package com.adrianarroyoc.ereservation.controllers.services;

import org.springframework.stereotype.Service;

import com.adrianarroyoc.ereservation.controllers.repositories.ClientRepository;
import com.adrianarroyoc.ereservation.models.Client;

/**
 * Class that defines the client services
 * @author adrianarroyoc
 *
 */

@Service
public class ClientService {
	
	private final ClientRepository clientRepository;

	public ClientService(ClientRepository clientRepository) {
		this.clientRepository = clientRepository;
	}

	/**
	 * Method definition for the client save operation 
	 * @param client
	 * @return
	 */
	public Client create(Client client) {
		return this.clientRepository.save(client);
	}
	
	/**
	 * Method definition for the client update operation 
	 * @param client
	 * @return
	 */
	public Client update(Client client) {
		return this.clientRepository.save(client);
	}
	
	/**
	 * Method definition for the client delete operation 
	 * @param client
	 */
	public void delete(Client client) {
		this.clientRepository.delete(client);
	}
	
	/**
	 * Method definition for the client search by the identification
	 * @param identificationCli
	 * @return
	 */
	public Client findByIdentification(String identificationCli) {
		return this.clientRepository.findByIdentification(identificationCli);
	}
	
}
