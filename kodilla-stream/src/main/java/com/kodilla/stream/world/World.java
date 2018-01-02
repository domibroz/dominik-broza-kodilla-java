package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

public class World {
    Set<Continent> continents = new HashSet<>();

    public BigDecimal getPeopleQuantity() {
        return continents.stream()
                .flatMap(continent -> continent.countries.stream())
                .map(country -> country.getPeopleQuantity())
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
    }
}
