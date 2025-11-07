package com.platinum.platinumAirline.dtos;

import com.platinum.platinumAirline.enums.City;
import com.platinum.platinumAirline.enums.Country;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AirportDTO {
   
    private Long id;
    @NotBlank(message = "Airport name is required")
    private String name;

    @NotNull(message = "City is required")
    private City city;

    @NotNull(message = "Country is required")
    private Country country;

    @NotBlank(message = "IATA code is required")
    private String iataCode;
}
