package com.kodilla.good.patterns.flights;

public class FlightServiceApp {
    public static void main(String[] args) {
        FlightSearch flightSearch = new FlightSearch();
        String flightsFrom = flightSearch.flightsFrom("WAW");
        System.out.println("Flights from WAW: ");
        System.out.println(flightsFrom);

        String flightsVia = flightSearch.flightsVia("KRK");
        System.out.println("Flights via KRK: ");
        System.out.println(flightsVia);


    }
}
