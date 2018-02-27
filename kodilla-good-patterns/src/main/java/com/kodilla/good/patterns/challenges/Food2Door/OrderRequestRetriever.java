package com.kodilla.good.patterns.challenges.Food2Door;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderRequestRetriever {
    private final Map<String, List<Order>> orderRequests;

    public OrderRequestRetriever() {
        orderRequests = new HashMap<>();

        List<Order> extraFoodOrder =
                Arrays.asList(new Order((new Product("Masło", 6.99)), 100),
                        new Order((new Product("Oliwa z oliwek", 19.99)), 50));

        orderRequests.put(Producer.EXTRA_FOOD_SHOP, extraFoodOrder);

        List<Order> healthyFoodOrder =
                Arrays.asList(new Order((new Product("Cebula", 0.50)), 29),
                        new Order((new Product("Marchewka",2)), 80));

        orderRequests.put(Producer.HEALTHY_SHOP, healthyFoodOrder);


        List<Order> glutenFreeShop =
                Arrays.asList(new Order((new Product("Woda", 133.99)), 3),
                        new Order((new Product("Powietrze",99.99)), 0));

        orderRequests.put(Producer.GLUTEN_FREE_SHOP, glutenFreeShop);
    }

    public Map<String, List<Order>> retrieve() {
        return orderRequests;
    }
}