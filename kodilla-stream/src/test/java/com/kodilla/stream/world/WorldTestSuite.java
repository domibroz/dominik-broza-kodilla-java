package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity() {
        Country country1 = new Country("Poland", new BigDecimal(40_000_000));
        Country country2 = new Country("UK", new BigDecimal(66_000_000));
        Country country3 = new Country("USA", new BigDecimal(323_000_000));
        Country country4 = new Country("Xyz", new BigDecimal(66_900_000));
        Country country5 = new Country("Abc", new BigDecimal(323_000_000));
        Country country6 = new Country("Bca", new BigDecimal(323_000_000));
        Continent continent1 = new Continent();
        continent1.countries.add(country1);
        continent1.countries.add(country2);
        continent1.countries.add(country3);
        Continent continent2 = new Continent();
        continent2.countries.add(country4);
        continent2.countries.add(country5);
        continent2.countries.add(country6);
        World world = new World();
        world.continents.add(continent1);
        world.continents.add(continent2);
        BigDecimal actualPeopleQuantity = world.getPeopleQuantity();
        BigDecimal expectedPeopleQuantity = new BigDecimal(1_141_900_000);

        Assert.assertEquals(expectedPeopleQuantity, actualPeopleQuantity);
    }
}
