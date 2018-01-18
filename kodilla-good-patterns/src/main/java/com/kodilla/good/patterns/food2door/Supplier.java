package com.kodilla.good.patterns.food2door;

import java.util.List;

interface Supplier {
    List<Product> productList();
    boolean process(Order order);
}
