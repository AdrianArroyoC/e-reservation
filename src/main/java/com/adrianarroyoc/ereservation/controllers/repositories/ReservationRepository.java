package com.adrianarroyoc.ereservation.controllers.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adrianarroyoc.ereservation.models.Reservation;

/**
 * Interface to define the bd operations related with the reservation
 * @author adrianarroyoc
 *
 */

public interface ReservationRepository extends JpaRepository<Reservation, String> {

}
