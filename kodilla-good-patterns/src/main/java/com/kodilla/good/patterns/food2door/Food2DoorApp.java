package com.kodilla.good.patterns.food2door;

import java.util.ArrayList;
import java.util.List;

import static com.kodilla.good.patterns.food2door.Food2DoorShop.*;

public class Food2DoorApp {
    public static void main(String[] args) {
        Suppliers suppliers = new Suppliers();
        ExtraFoodShop extraFoodSupplier = new ExtraFoodShop();
        suppliers.add(extraFoodSupplier);

        System.out.println(suppliers.getProductsFor(extraFoodSupplier));

        List<Product> orderProductList = new ArrayList<>();
        orderProductList.add(new Product("water1l", 0.25));
        orderProductList.add(new Product("drinkO2", 1.05));
        Order order = new Order(orderProductList);
        String placeOrder = placeOrder(order, extraFoodSupplier);
        System.out.println(placeOrder);

        HealthyShop healthySupplier = new HealthyShop();
        suppliers.add(healthySupplier);
        placeOrder = placeOrder(order, healthySupplier);
        System.out.println(placeOrder);
    }
}
