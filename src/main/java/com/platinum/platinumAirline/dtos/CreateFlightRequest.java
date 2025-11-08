package com.platinum.platinumAirline.dtos;

import com.platinum.platinumAirline.enums.FlightStatus;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CreateFlightRequest {

    private Long id;

    private FlightStatus status;

    @NotBlank(message = "Flight Number is required")
    private String flightNumber;

    @NotBlank(message = "Departure Airport IATA code cannot be blank")
    private String departureAirportIataCode;

    @NotBlank(message = "Arrival Airport IATA code cannot be blank")
    private String arrivalAirportIataCode;

    @NotBlank(message = "Departure Time Must be Enterd")
    private LocalDateTime departureTime;

    @NotBlank(message = "Arrival Time Must be Enterd")
    private LocalDateTime arrivalTime;

    @NotBlank(message = "Base Price is Required")
    @Positive(message = "Base Price Must Be Positive")
    private BigDecimal basePrice;

    private Long pilotId;
}
