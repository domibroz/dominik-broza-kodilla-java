package com.kodilla.good.patterns.food2door;

import java.util.ArrayList;
import java.util.List;

import static com.kodilla.good.patterns.food2door.Food2DoorShop.*;

public class Food2DoorApp {
    public static void main(String[] args) {
        Suppliers suppliers = new Suppliers();
        ExtraFoodSupplier extraFoodSupplier = new ExtraFoodSupplier();
        suppliers.add(extraFoodSupplier);

        System.out.println(suppliers.getProductsFor(extraFoodSupplier));

        List<Product> orderProductList = new ArrayList<>();
        orderProductList.add(new Product("water1l", 0.25));
        orderProductList.add(new Product("drinkO2", 1.05));
        Order order1 = new Order(orderProductList, extraFoodSupplier);
        String placeOrder = placeOrder(order1);
        System.out.println(placeOrder);

        HealthySupplier healthySupplier = new HealthySupplier();
        suppliers.add(healthySupplier);
        Order order2 = new Order(orderProductList, healthySupplier);
        placeOrder = placeOrder(order2);
        System.out.println(placeOrder);
    }
}
