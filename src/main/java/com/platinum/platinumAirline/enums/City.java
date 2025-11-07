package com.platinum.platinumAirline.enums;

public enum City {
    CAIRO(Country.EGYPT),
    ALEXANDERIA(Country.EGYPT),
    ISTANBUL(Country.TURKIYE),
    IZMIR(Country.TURKIYE),
    NEWYORK(Country.USA),
    CALIFORNIA(Country.USA),
    LONDON(Country.UK),
    LIVERPOOL(Country.UK),
    BERLIN(Country.GERMANY),
    FRANKFURT(Country.GERMANY);



    private final Country country;
    City(Country country) {
        this.country = country;
    }
}
