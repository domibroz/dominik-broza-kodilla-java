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
        boolean save = false;
        if (isAvailable) {
            save = orderRepository.save(order);
            String inform = informationService.inform(order, true, save);
            System.out.println(inform);

        } else {
            String inform = informationService.inform(order, false, save);
            System.out.println(inform);
        }
    }


}
