package com.platinum.platinumAirline.dtos;


import com.platinum.platinumAirline.enums.PassengerType;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PassengerDTO {

    private Long id;

    @NotBlank(message = "First Name Required")
    private String firstName;

    @NotBlank(message = "Last Name Required")
    private String lastName;

    @NotBlank(message = "Passport Number Required")
    private String passportNumber;

    @NotNull(message = "Select The Passenger Type")
    private PassengerType passengerType;

    private String seatNumber;

    private String specialRequest;
}
