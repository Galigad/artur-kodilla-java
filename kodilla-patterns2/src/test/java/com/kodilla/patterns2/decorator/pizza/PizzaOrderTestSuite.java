package com.kodilla.patterns2.decorator.pizza;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.List;

public class PizzaOrderTestSuite {

    @Test
    public void testBasicPizzaOrderGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        //When
        BigDecimal cost = theOrder.getCost();
        //Then
        Assert.assertEquals(new BigDecimal(25), cost);
    }

    @Test
    public void testBasicPizzaOrderGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        //When
        String description = theOrder.getDescription();
        //Then
        Assert.assertEquals("Basic pizza 30 cm with: tomato sauce on thick dough.", description);
    }

    @Test
    public void testCheesePizzaOrderGetCost() {
        //Given
        PizzaOrder theOrder = new CheesePizzaOrder();
        //When
        BigDecimal cost = theOrder.getCost();
        //Then
        Assert.assertEquals(new BigDecimal(50), cost);
    }

    @Test
    public void testCheesePizzaAndExtraCheeseOrderGetDescription(){
        //Given
        PizzaOrder theOrder = new CheesePizzaOrder();
        theOrder = new ExtraCheeseDecorator(theOrder);
        //When
        String description = theOrder.getDescription();
        //Then
        Assert.assertEquals("Cheese pizza 60 cm with: mozzarella, cheddar, permigiano-reggiano, ricotta on thick dough. + extra cheese", description);
    }
    @Test
    public void testAllMeatPizzaAndExtraCheeseOrderGetCost(){
        //Given
        PizzaOrder theOrder = new AllMeatPizzaOrder();
        theOrder = new ExtraCheeseDecorator(theOrder);
        //When
        BigDecimal cost = theOrder.getCost();
        //Then
        Assert.assertEquals(new BigDecimal(40), cost);
    }
}
