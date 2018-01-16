package com.kodilla.good.patterns.flights;

import java.util.Set;
import java.util.stream.Collectors;

public class FlightSearch {
    public String flightsTo(String arrivalAirport) {
        FlightRepository flightRepository = new FlightRepository();
        Set<Flight> flights = flightRepository.getFlights().stream()
                .filter(f -> f.getArrivalAirport().equals(arrivalAirport))
                .collect(Collectors.toSet());

        return (flights.toString());
    }

    public String flightsFrom(String departureAirport) {
        FlightRepository flightRepository = new FlightRepository();
        Set<Flight> flights = flightRepository.getFlights().stream()
                .filter(f -> f.getDepartureAirport().equals(departureAirport))
                .collect(Collectors.toSet());

        return (flights.toString());
    }

    public String flightsVia(String intermediateAirport) {
        FlightRepository flightRepository = new FlightRepository();
        Set<Flight> flights = flightRepository.getFlights().stream()
                .filter(f -> f.getIntermediateAirport().equals(intermediateAirport))
                .collect(Collectors.toSet());

        return (flights.toString());
    }
}
