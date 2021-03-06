package com.kodilla.good.patterns.food2door;

import java.util.List;
import java.util.Objects;

public class Order {
    List<Product> orderProducts;
    Supplier supplier;


    public Order(List<Product> orderProducts, Supplier supplier) {
        this.orderProducts = orderProducts;
        this.supplier = supplier;
    }

    public List<Product> getOrderProducts() {
        return orderProducts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Objects.equals(getOrderProducts(), order.getOrderProducts());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getOrderProducts());
    }
}
