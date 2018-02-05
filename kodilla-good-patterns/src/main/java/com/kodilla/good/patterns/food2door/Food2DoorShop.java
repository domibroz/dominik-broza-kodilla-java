package com.kodilla.good.patterns.food2door;

public class Food2DoorShop {
    public static String placeOrder(Order order) {
        if (order.supplier.process(order)) {
            return ("Order in " + order.supplier.getClass().getSimpleName() + " completed");
        } else {
            return ("Order in " + order.supplier.getClass().getSimpleName() + " failed.");
        }
    }
}
