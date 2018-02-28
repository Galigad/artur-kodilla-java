package com.kodilla.good.patterns.challenges.Flights;

import java.util.HashSet;
import java.util.Set;

public class FlightDatabase {

    private static Set<Flight> flightSet = new HashSet<>();

    public static Set<Flight> getFlightSet() {

        flightSet.add(new Flight(City.Poznan, City.Warszawa));
        flightSet.add(new Flight(City.Jasionka, City.Gdansk));
        flightSet.add(new Flight(City.Jasionka, City.Wroclaw));
        flightSet.add(new Flight(City.Jasionka, City.Krakow));
        flightSet.add(new Flight(City.Jasionka, City.Poznan));
        flightSet.add(new Flight(City.Jasionka, City.Lublin));
        flightSet.add(new Flight(City.Poznan, City.Krakow));
        flightSet.add(new Flight(City.Poznan, City.Gdansk));
        flightSet.add(new Flight(City.Krakow, City.Wroclaw));
        flightSet.add(new Flight(City.Lublin, City.Krakow));
        flightSet.add(new Flight(City.Lublin, City.Wroclaw));
        flightSet.add(new Flight(City.Gdansk, City.Wroclaw));

        return flightSet;
    }
}