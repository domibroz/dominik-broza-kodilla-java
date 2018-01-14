package com.kodilla.good.patterns.challenges;

public class ProductOrderService {
    private StoreService storeService;
    private OrderRepository orderRepository;
    private InformationService informationService;

    public ProductOrderService(StoreService storeService, OrderRepository orderRepository, InformationService informationService) {
        this.storeService = storeService;
        this.orderRepository = orderRepository;
        this.informationService = informationService;
    }

    public void order(Order order) {
        boolean isAvailable = storeService.isAvailable(order.getProduct());
        if (isAvailable) {
            boolean save = orderRepository.save(order);
            String inform = informationService.inform(order, true);
            System.out.println(inform);

        } else {
            String inform = informationService.inform(order, false);
            System.out.println(inform);
        }
    }

    public static void main(String[] args) {
        ProductOrderService productOrderService = new ProductOrderService(new InMemoryStoreService(), new InMemoryOrderRepository(), new InMemoryInformationService());
        PurchaseSimulator purchaseSimulator = new PurchaseSimulator();
        productOrderService.order(purchaseSimulator.purchase());


    }


}
