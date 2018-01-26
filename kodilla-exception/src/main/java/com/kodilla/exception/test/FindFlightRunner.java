package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FindFlightRunner {

    public static void main(String[] args) {

        Flight flight = new Flight("Warszawa", "Oslo");
        FindFlightRunner find = new FindFlightRunner();

        try {
            find.findFlight(flight);
        } catch (RouteNotFoundException e) {
            System.out.println("Sorry! Flight you were looking for was not found." +
                    " \nPlease try other flight.");
        }
    }

    public void findFlight(Flight flight) throws RouteNotFoundException {

        Map<String, Boolean> airportsList = new HashMap<>();

        airportsList.put("Jasionka", true);
        airportsList.put("Warszawa", false);
        airportsList.put("Katowice", true);
        airportsList.put("Kielce", false);
        airportsList.put("Radom", true);

        if (!(airportsList.containsKey(flight.getDepartureAirport()) && airportsList.containsKey(flight.getArrivalAirport())))
            throw new RouteNotFoundException("Departure or Arrival airport was not found");
        System.out.println("Flight to " + flight.getArrivalAirport() + " from " + flight.getDepartureAirport() + " was found.");
    }
}