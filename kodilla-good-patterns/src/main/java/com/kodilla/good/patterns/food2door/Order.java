package com.kodilla.good.patterns.food2door;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Order {
    Supplier supplier;
    List<Product> orderProducts;

    public Order(Supplier supplier, List<Product> orderProducts) {
        this.supplier = supplier;
        this.orderProducts = orderProducts;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public List<Product> getOrderProducts() {
        return orderProducts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Objects.equals(getSupplier(), order.getSupplier()) &&
                Objects.equals(getOrderProducts(), order.getOrderProducts());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getSupplier(), getOrderProducts());
    }
}
