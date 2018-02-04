package com.kodilla.good.patterns.challenges;

public class OrderServiceApplication {
    public static void main(String[] args) {
        ProductOrderService productOrderService = new ProductOrderService(new InMemoryStoreService(), new InMemoryOrderRepository(), new InMemoryInformationService());
        PurchaseSimulator purchaseSimulator = new PurchaseSimulator();
        productOrderService.order(purchaseSimulator.purchase());
    }
}
