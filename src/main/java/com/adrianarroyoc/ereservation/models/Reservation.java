package com.adrianarroyoc.ereservation.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

/**
 * Class that represents the reservation table
 * @author adrianarroyoc
 *
 */

@Data
@Entity
@Table(name = "reservation")
public class Reservation {

	@Id
	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid", strategy="uuid2")
	private String idRes;
	@Temporal(TemporalType.DATE)
	private Date startDateRes;
	@Temporal(TemporalType.DATE)
	private Date endDateRes;
	private int guestsRes;
	private String descriptionRes;
	@ManyToOne
	@JoinColumn(name="idCli")
	private Client client;
	
	public Reservation() {
		
	}

}
