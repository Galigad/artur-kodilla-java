package com.kodilla.good.patterns.challenges.Flights;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlightSearch {
    public static List<Flight> travelFromOneCity(City departureCity) {
        System.out.println("\nRealizowane loty z " + departureCity + ": ");
        return FlightDatabase.getFlightSet().stream()
                .filter(flight -> flight.getDepartureCity() == departureCity)
                .collect(Collectors.toList());
    }

    public static List<Flight> travelToOneCity(City arrivalCity) {
        System.out.println("\nRealizowane loty do " + arrivalCity + ": ");
        return FlightDatabase.getFlightSet().stream()
                .filter(flight -> flight.getArrivalCity() == arrivalCity)
                .collect(Collectors.toList());
    }

    public static List<Flight> travelFromOneCityToOneCityWithIndirectCity(City departureCity, City indirectCity, City arrivalCity) {
        System.out.println("\nRealizowane loty z " + departureCity + " do " + arrivalCity + " przez " + indirectCity + ": ");
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
