package com.kodilla.good.patterns.challenges.Food2Door;

public class Product {
    private final String productName;
    private final double prize;

    public Product(String productName, double prize) {
        this.productName = productName;
        this.prize = prize;
    }

    @Override
    public String toString() {
        return "Nazwa produktu = " + productName +
                ", cena = " + prize;
    }
}