package com.kodilla.good.patterns.challenges.exampleShop;

public class ProductOrderService {
    private InformationService informationService;
    private OrderService orderService;
    private OrderRepository orderRepository;

    public ProductOrderService(InformationService informationService, OrderService orderService, OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public OrderTo process(final OrderRequest orderRequest) {
        boolean isOrdered = orderService.order(orderRequest);

        if (isOrdered) {
            informationService.inform(orderRequest.getUser());
            orderRepository.createAnOrder(orderRequest);
            System.out.println("Zamówienie na " + orderRequest.getProduct().getName() +
                    " o wartości " + orderRequest.getProduct().getPrice() + "PLN" + " dla " +
                    orderRequest.getUser() + " zostało zrealizowane!");

            return new OrderTo(orderRequest.getUser(), true);
        } else {
            System.out.println("Pojawiły się jakieś błędy...");
            System.out.println("Spróbuj ponownie w późniejszym terminie.");
            return new OrderTo(orderRequest.getUser(), false);
        }
    }
}
