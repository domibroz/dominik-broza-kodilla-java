package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightSearch {
    public static void findFlight(Flight flight)throws RouteNotFoundException{
        Map<String , Boolean> airports = new HashMap<>();
        airports.put("GDI", true);
        airports.put("WAW", false);
        if(airports.get(flight.getArrivalAirport())){
            System.out.println("You can fly from: " + flight.getDepartureAirport()+" to: " + flight.getArrivalAirport());
        }
        else {
            throw new RouteNotFoundException();
        }
    }
    public static void main(String[] args) {
        Flight flight1 = new Flight("WAW", "GDI");
        Flight flight2 = new Flight("POZ", "WAW");
        Flight fly = flight2;
        try {
            findFlight(fly);
        } catch (RouteNotFoundException e) {
            System.out.println("You can not fly to: "+ fly.getArrivalAirport());
        }

    }
}
