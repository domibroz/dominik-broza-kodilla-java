package com.kodilla.good.patterns.food2door;

public class Food2DoorShop {
    public static String placeOrder(Order order, Supplier supplier) {
        if (supplier.process(order)) {
            return ("Order in " + supplier.getClass().getSimpleName() + " completed");
        } else {
            return ("Order in " + supplier.getClass().getSimpleName() + " failed.");
        }
    }
}
