package com.kodilla.good.patterns.challenges;

public class PurchaseSimulator {
    Order purchase(){
        return new Order(3, new User("Jan", "Kowalski", "jan@kow.pl"), new Product("phone", 234.00));
    }
}
