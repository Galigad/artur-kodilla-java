package com.kodilla.good.patterns.challenges.Food2Door;

import java.util.List;
import java.util.Map;

public class Application {
    public static void main(String[] args) {

        OrderService extraFoodService = orders -> {
            System.out.println("Proces zamówień: " + orders + " z sklepu: " + Producer.EXTRA_FOOD_SHOP);
            return true;
        };

        OrderService healthyFoodService = orders -> {
            System.out.println("Proces zamówień: " + orders + " z sklepu: " + Producer.HEALTHY_SHOP);
            return false;
        };

        OrderService glutenFreeFoodService = orders -> {
            System.out.println("Proces zamówień: " + orders + " z sklepu: " + Producer.GLUTEN_FREE_SHOP);
            return true;
        };

        OrderRequestRetriever requestRetriever = new OrderRequestRetriever();
        Map<String, List<Order>> orders = requestRetriever.retrieve();

        ProducerProcessor extraFoodProcessor = new ProducerProcessor(extraFoodService);
        ProducerProcessor healthyFoodProcessor = new ProducerProcessor(healthyFoodService);
        ProducerProcessor glutenFreeFoodProcessor = new ProducerProcessor(glutenFreeFoodService);


        extraFoodProcessor.process(orders.get(Producer.HEALTHY_SHOP));
        extraFoodProcessor.result();

        healthyFoodProcessor.process(orders.get(Producer.EXTRA_FOOD_SHOP));
        healthyFoodProcessor.result();

        glutenFreeFoodProcessor.process(orders.get(Producer.GLUTEN_FREE_SHOP));
        glutenFreeFoodProcessor.result();
    }
}
