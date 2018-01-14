package com.kodilla.good.patterns.challenges;

public class InMemoryInformationService implements InformationService {
    public String inform(Order order, boolean result) {
        if (result) {
            return "Order completed.";
        } else {
            return "Product is not available.";
        }
    }
}
