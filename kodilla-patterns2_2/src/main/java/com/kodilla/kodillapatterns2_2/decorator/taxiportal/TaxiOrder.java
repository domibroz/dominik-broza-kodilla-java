package com.kodilla.kodillapatterns2_2.decorator.taxiportal;

import java.math.BigDecimal;

public interface TaxiOrder {
    BigDecimal getCost();
    String getDescription();
}
