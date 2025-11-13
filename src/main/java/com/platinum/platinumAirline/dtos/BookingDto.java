package com.platinum.platinumAirline.dtos;


import com.platinum.platinumAirline.enums.BookingStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookingDto {

    private Long id;

    private String bookingReference;

    private UserDto user;

    private FlightDTO flight;

    private BookingStatus status;

    private LocalDateTime bookingDate;

    private List<PassengerDTO> passengers;

}
