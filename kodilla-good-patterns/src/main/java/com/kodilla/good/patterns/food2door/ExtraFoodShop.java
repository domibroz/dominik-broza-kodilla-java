package com.kodilla.good.patterns.food2door;

import java.util.ArrayList;
import java.util.List;

public class ExtraFoodShop implements Supplier {
    List<Product> products = new ArrayList<>();

    public ExtraFoodShop() {
        products.add(new Product("water1l", 0.25));
        products.add(new Product("drinkO2", 1.05));
    }

    public List<Product> productList() {
        return products;
    }

    public boolean process(Order order) {
        return products.containsAll(order.getOrderProducts());

    }
}
