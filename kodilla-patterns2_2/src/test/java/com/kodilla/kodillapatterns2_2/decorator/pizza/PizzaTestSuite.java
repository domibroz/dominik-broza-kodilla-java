package com.kodilla.kodillapatterns2_2.decorator.pizza;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class PizzaTestSuite {
    @Test
    public void testOrderWithDoubleCheeseAndHamAndMushrooms(){
        Pizza pizza = new BasicPizzaOrder();
        pizza = new DoubleCheeseDecorator(pizza);
        pizza = new HamDecorator(pizza);
        pizza = new MushroomDecorator(pizza);

        BigDecimal cost = pizza.getCost();
        String descr = pizza.getDescription();

        Assert.assertEquals(new BigDecimal(14), cost);
        Assert.assertEquals("Pizza with tomato sauce + double cheese + ham + mushrooms", descr);
    }
}
