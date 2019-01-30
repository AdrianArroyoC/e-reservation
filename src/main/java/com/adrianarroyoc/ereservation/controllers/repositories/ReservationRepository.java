package com.adrianarroyoc.ereservation.controllers.repositories;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.adrianarroyoc.ereservation.models.Reservation;

/**
 * Interface to define the bd operations related with the reservation
 * @author adrianarroyoc
 *
 */

public interface ReservationRepository extends JpaRepository<Reservation, String> {

	// JPQL
	@Query("Select r from Reserva r where r.startDateRes =:starDate and r.endDateRes =:endDate")
	public List<Reservation> find(@Param("starDate") Date startDate, @Param("endDate") Date endDate);
	
}
