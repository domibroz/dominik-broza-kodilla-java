package com.kodilla.good.patterns.food2door;

import java.util.ArrayList;
import java.util.List;

public class Suppliers {
    List<Supplier> suppliers = new ArrayList<>();
    public void addSupplier(Supplier supplier){
        suppliers.add(supplier);
    }
    public List supplierProducts(Supplier supplier){
        return supplier.productList();
    }
}
