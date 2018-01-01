package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {
    @Test
            public void testGetPeopleQuantity() {
        Country country1 = new Country("Poland", new BigDecimal(40000000));
        Country country2 = new Country("UK", new BigDecimal(66000000));
        Country country3 = new Country("USA", new BigDecimal(323000000));
        Continent continent = new Continent();
        continent.countries.add(country1);
        continent.countries.add(country2);
        continent.countries.add(country3);
        World world = new World();
        world.continents.add(continent);
        BigDecimal actualPeopleQuantity = world.getPeopleQuantity();
        BigDecimal expectedPeopleQuantity = new BigDecimal(429000000);

        Assert.assertEquals(expectedPeopleQuantity, actualPeopleQuantity);

    }
}
