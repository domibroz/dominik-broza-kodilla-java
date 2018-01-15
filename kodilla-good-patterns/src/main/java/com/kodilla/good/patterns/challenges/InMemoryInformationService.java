package com.kodilla.good.patterns.challenges;

public class InMemoryInformationService implements InformationService {
    public String inform(Order order, boolean result, boolean save) {
        if (result) {
            if (save) {
                return "Order completed and saved.";
            }else{
                return "Order unsaved.";
            }
        } else {
            return "Product is not available.";
        }
    }
}
