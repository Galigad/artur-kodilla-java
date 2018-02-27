package com.kodilla.good.patterns.challenges.exampleShop;

public interface OrderRepository {
    boolean createAnOrder(OrderRequest orderRequest);
}
