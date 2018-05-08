package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public interface PizzaOrder {
    int getSize();
    String getDough();
    String getComponent();
    BigDecimal getCost();
    String getDescription();
}
