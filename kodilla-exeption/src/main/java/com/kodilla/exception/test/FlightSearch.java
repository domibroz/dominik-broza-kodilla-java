package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightSearch {
    public static void findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> airports = new HashMap<>();
        airports.put("GDI", true);
        airports.put("WAW", false);
        if (airports.containsKey(flight.getArrivalAirport())) {
            if (airports.get(flight.getArrivalAirport())) {
                System.out.println("You can fly from: " + flight.getDepartureAirport() + " to: " + flight.getArrivalAirport());
            } else {
                System.out.println("You can not fly from: " + flight.getDepartureAirport() + " to: " + flight.getArrivalAirport());
                throw new RouteNotFoundException(flight.getDepartureAirport()+" to "+ flight.getArrivalAirport());
            }
        } else {
            System.out.println("Wrong destination!");
        }
    }

    public static void main(String[] args) {
        Flight flight1 = new Flight("WAW", "GDI");
        Flight flight2 = new Flight("POZ", "WAW");
        Flight fly = flight2;
        try {
            findFlight(fly);
        } catch (RouteNotFoundException e) {
            System.out.println("The " + fly.getArrivalAirport() + " airport is not available.");
        }

    }
}
