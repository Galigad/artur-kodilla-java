package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class CheesePizzaOrder implements PizzaOrder {
    @Override
    public int getSize() {
        return 60;
    }

    @Override
    public String getDough() {
        return "thick";
    }

    @Override
    public String getComponent() {
        return "mozzarella, cheddar, permigiano-reggiano, ricotta";
    }

    @Override
    public BigDecimal getCost() {
        return new BigDecimal(50);
    }

    @Override
    public String getDescription() {
        return "Cheese pizza " + getSize() + " cm with: " + getComponent() + " on " + getDough() + " dough.";
    }
}
