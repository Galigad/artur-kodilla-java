package com.kodilla.good.patterns.challenges.Flights;

public class Application {
    public static void main(String[] args) {
        System.out.println(FlightSearch.travelFromOneCity(City.Jasionka));
        System.out.println(FlightSearch.travelToOneCity(City.Krakow));
        System.out.println(FlightSearch.travelFromOneCityToOneCityWithIndirectCity(City.Jasionka, City.Lublin, City.Krakow));
    }
}