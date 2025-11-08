package com.platinum.platinumAirline.dtos;


import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CreateBookingRequest {

    @NotNull(message = "Flight ID is Required")
    private Long flightId;

    @NotEmpty(message = "At Least one Passenger must be Entered")
    private List<PassengerDTO> passengers;
}
