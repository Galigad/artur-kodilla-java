package com.kodilla.good.patterns.challenges.exampleShop;

public class Application {
    public static void main(String[] args) {
        User user = new User("Artur", "Szuberla", "arti_2@o2.pl", 781043114, "Rzeszów");
        Product product = new Product("Żelazko", 200);
        OrderRequest orderRequest = new OrderRequest(user, product);

        ProductOrderService orderService = new ProductOrderService(new EmailInformationService(), new OrderService(), new ProductOrderRepository());
        orderService.process(orderRequest);
    }
}