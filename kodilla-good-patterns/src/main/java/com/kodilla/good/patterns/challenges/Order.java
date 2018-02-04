package com.kodilla.good.patterns.challenges;

import java.util.Objects;

public class Order {
    private int quantity;
    private User user;
    private Product product;

    public int getQuantity() {
        return quantity;
    }

    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }

    public Order(int quantity, User user, Product product) {
        this.quantity = quantity;
        this.user = user;
        this.product = product;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return getQuantity() == order.getQuantity() &&
                Objects.equals(getUser(), order.getUser()) &&
                Objects.equals(getProduct(), order.getProduct());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getQuantity(), getUser(), getProduct());
    }
}
