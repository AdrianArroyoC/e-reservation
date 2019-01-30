package com.adrianarroyoc.ereservation.models;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

/**
 * Class that represents the client table
 * @author adrianarroyoc
 *
 */

@Data
@Entity
@Table(name = "client")
// JPQL
@NamedQuery(name="Client.findByIdentification", query="Select c from Client c where c.identificationCli = ?1") 
public class Client {
	
	@Id
	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid", strategy="uuid2")
	private String idCli;
	private String nameCli;
	private String lastNameCli;
	private String identificationCli;
	private String addressCli;
	private String phoneCli;
	private String emailCli;
	@OneToMany(mappedBy="client")
	private Set<Reservation> reservations;
	
	public Client() {
		
	}
	
}
