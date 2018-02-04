package com.kodilla.good.patterns.food2door;

import java.util.ArrayList;
import java.util.List;

public class Suppliers {
    List<Supplier> suppliers = new ArrayList<>();
    public void add(Supplier supplier) {
        suppliers.add(supplier);
    }
    public List<Product> getProductsFor(Supplier supplier) {
        return supplier.productList();
    }
}
