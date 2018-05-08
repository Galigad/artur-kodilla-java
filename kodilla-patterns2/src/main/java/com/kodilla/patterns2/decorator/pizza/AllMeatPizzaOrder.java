package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class AllMeatPizzaOrder implements PizzaOrder {
    @Override
    public int getSize() {
        return 45;
    }

    @Override
    public String getDough() {
        return "thick";
    }

    @Override
    public String getComponent() {
        return "pepperoni, sausage, bacon";
    }

    @Override
    public BigDecimal getCost() {
        return new BigDecimal(35);
    }

    @Override
    public String getDescription() {
        return "All meat pizza " + getSize() + " cm with: " + getComponent() + " on " + getDough() + " dough.";
    }
}
