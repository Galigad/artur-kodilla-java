package com.kodilla.good.patterns.challenges.exampleShop;

public class ProductOrderRepository implements OrderRepository {
    @Override
    public boolean createAnOrder(OrderRequest orderRequest) {
        System.out.println("Zamówienie zostało wygenerowane!");
        return true;
    }
}
