package com.adrianarroyoc.ereservation.views.resources;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adrianarroyoc.ereservation.controllers.services.ClientService;
import com.adrianarroyoc.ereservation.models.Client;
import com.adrianarroyoc.ereservation.views.resources.vo.ClientVO;

/**
 * Class that represents the client web service
 * @author adrianarroyoc
 *
 */

@RestController
@RequestMapping("/api/client")
public class ClientResource {

	private final ClientService clientService;
	
	public ClientResource(ClientService clientService) {
		this.clientService = clientService;
	}
	
	@PostMapping
	public ResponseEntity<Client> createClient(@RequestBody ClientVO clientVo) {
		Client client = new Client();
		client.setNameCli(clientVo.getNameCli());
		client.setLastNameCli(clientVo.getLastNameCli());
		client.setIdentificationCli(clientVo.getIdentificationCli());
		client.setAddressCli(clientVo.getAddressCli());
		client.setPhoneCli(clientVo.getPhoneCli());
		client.setEmailCli(clientVo.getEmailCli());
		return new ResponseEntity<>(this.clientService.create(client), HttpStatus.CREATED);
	}
	
	@PutMapping("/{identification}")
	public ResponseEntity<Client> updateClient(@PathVariable("identification") String identification, ClientVO clientVo) {
		Client client = this.clientService.findByIdentification(identification);
		if (client == null) {
			return new ResponseEntity<Client>(HttpStatus.NOT_FOUND);
		} else {
			client.setNameCli(clientVo.getNameCli());
			client.setLastNameCli(clientVo.getLastNameCli());
			client.setIdentificationCli(clientVo.getIdentificationCli());
			client.setAddressCli(clientVo.getAddressCli());
			client.setPhoneCli(clientVo.getPhoneCli());
			client.setEmailCli(clientVo.getEmailCli());
			return new ResponseEntity<>(this.clientService.update(client), HttpStatus.OK);
		}
	}

	@DeleteMapping("/{identification}")
	public void removeClient(@PathVariable("identification") String identification) {
		Client client = this.clientService.findByIdentification(identification);
		if (client != null) {
			this.clientService.delete(client);
		}
	}
	
	public ResponseEntity<List<Client>> findAll() {
		return ResponseEntity.ok(this.clientService.findAll());
	}
	
}
