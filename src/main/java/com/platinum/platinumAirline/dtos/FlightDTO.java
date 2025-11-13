package com.platinum.platinumAirline.dtos;


import com.platinum.platinumAirline.entities.Booking;
import com.platinum.platinumAirline.entities.User;
import com.platinum.platinumAirline.enums.FlightStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FlightDTO {

    private Long id;


    private String flightNumber;


    private FlightStatus status;


    private AirportDTO departureAirport;


    private AirportDTO arrivalAirport;

    private LocalDateTime departureTime;

    private LocalDateTime arrivalTime;

    private BigDecimal basePrice;


    private User assignedPilot;


    private List<Booking> bookings = new ArrayList<>();

    private String departureairportIatacode;
    private String arrivalairportIatacode;
}
