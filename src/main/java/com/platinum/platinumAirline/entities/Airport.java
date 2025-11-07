package com.platinum.platinumAirline.entities;

import com.platinum.platinumAirline.enums.City;
import com.platinum.platinumAirline.enums.Country;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "airports")
@AllArgsConstructor
@NoArgsConstructor

public class Airport {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private City city;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Country country;

    @Column(nullable = false, unique = true, length = 4)
    private String iataCode;

}
