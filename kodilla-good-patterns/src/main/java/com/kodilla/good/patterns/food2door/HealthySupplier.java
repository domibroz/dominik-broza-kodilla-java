package com.kodilla.good.patterns.food2door;

import java.util.ArrayList;
import java.util.List;

public class HealthySupplier implements Supplier {
    List<Product> products = new ArrayList<>();
    public HealthySupplier() {
        products.add(new Product("orangeJuice", 1.00));
        products.add(new Product("appleJuice", 1.00));
    }

    public List<Product> productList() {
        return products;
    }

    public boolean process(Order order) {
        return products.containsAll(order.getOrderProducts());

    }
}
