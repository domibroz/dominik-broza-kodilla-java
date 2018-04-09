package com.kodilla.kodillapatterns2_2.decorator.pizza;

import java.math.BigDecimal;

public class BasicPizzaOrder implements Pizza {
    @Override
    public BigDecimal getCost() {
        return new BigDecimal(5);
    }

    @Override
    public String getDescription() {
        return "Pizza with tomato sauce";
    }
}
