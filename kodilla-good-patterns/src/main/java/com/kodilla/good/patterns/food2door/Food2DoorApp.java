package com.kodilla.good.patterns.food2door;

import java.util.ArrayList;
import java.util.List;

public class Food2DoorApp {
    public static void main(String[] args) {
        Suppliers suppliers = new Suppliers();
        ExtraFoodShop extraFoodShop = new ExtraFoodShop();
        suppliers.addSupplier(extraFoodShop);

        System.out.println(suppliers.supplierProducts(extraFoodShop));

        List<Product> order1 = new ArrayList<>();
        order1.add(new Product("water1l", 0.25));
        order1.add(new Product("drinkO2", 1.05));
        Order order = new Order(extraFoodShop, order1);

        if (extraFoodShop.process(order)) {
            System.out.println("Order completed");
        } else {
            System.out.println("Order failed.");
        }


    }
}
