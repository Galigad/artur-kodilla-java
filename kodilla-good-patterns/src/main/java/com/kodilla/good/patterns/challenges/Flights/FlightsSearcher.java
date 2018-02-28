package com.kodilla.good.patterns.challenges.Flights;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlightsSearcher {
    public static List<Flight> flightsFromDepartureCity(City departureCity) {
        return FlightDatabase.getFlightSet().stream()
                .filter(flight -> flight.getDepartureCity() == departureCity)
                .collect(Collectors.toList());
    }

    public static List<Flight> flightsToArrivalCity(City arrivalCity) {
        return FlightDatabase.getFlightSet().stream()
                .filter(flight -> flight.getArrivalCity() == arrivalCity)
                .collect(Collectors.toList());
    }

    public static List<Flight> checkFlightWithIndirectCity(City departureCity, City indirectCity, City arrivalCity) {
        Flight firstStepOfTravel = new Flight(departureCity, indirectCity);
        Flight secondStepOfTravel = new Flight(indirectCity, arrivalCity);

        ArrayList<Flight> allStepsOfTravel = new ArrayList<>();

        if(FlightDatabase.getFlightSet().contains(firstStepOfTravel) && FlightDatabase.getFlightSet().contains(secondStepOfTravel)) {
            allStepsOfTravel.add(firstStepOfTravel);
            allStepsOfTravel.add(secondStepOfTravel);
        }

        return allStepsOfTravel;
    }
}