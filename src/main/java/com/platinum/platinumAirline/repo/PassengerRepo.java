package com.platinum.platinumAirline.repo;

import com.platinum.platinumAirline.entities.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PassengerRepo extends JpaRepository<Passenger, Long> {
}
