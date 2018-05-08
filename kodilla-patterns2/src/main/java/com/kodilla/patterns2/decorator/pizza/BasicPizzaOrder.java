package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class BasicPizzaOrder implements PizzaOrder {
    @Override
    public int getSize() {
        return 30;
    }

    @Override
    public String getDough() {
        return "thick";
    }

    @Override
    public String getComponent() {
        return "tomato sauce";
    }

    @Override
    public BigDecimal getCost() {
        return new BigDecimal(25);
    }

    @Override
    public String getDescription() {
        return "Basic pizza " + getSize() + " cm with: " + getComponent() + " on " + getDough() + " dough.";
    }
}
