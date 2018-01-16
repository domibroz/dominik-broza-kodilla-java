package com.kodilla.good.patterns.food2door;

import java.util.List;
import java.util.Map;

interface Supplier {
List productList();
boolean process(Order order);
}
