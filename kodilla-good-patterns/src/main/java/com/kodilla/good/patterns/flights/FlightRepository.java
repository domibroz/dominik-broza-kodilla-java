package com.kodilla.good.patterns.flights;

import java.util.HashSet;
import java.util.Set;

public class FlightRepository {
    private Set<Flight> flights = new HashSet<>();

    public FlightRepository() {
        flights.add(new Flight("WAW", "GDN"));
        flights.add(new Flight("WAW", "WRO"));
        flights.add(new Flight("POZ",  "KTW"));
        flights.add(new Flight("GDN", "WRO"));
        flights.add(new Flight("WRO", "KRK"));
    }

    public Set<Flight> getFlights() {
        return flights;
    }

    public void addFlight(Flight flight) {
        flights.add(flight);
    }

}
