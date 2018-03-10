package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void testNewBigmac() {
        //Given
            Bigmac bigmac = new Bigmac.BigmacBuilder()
                    .roll(Roll.CLASSIC)
                    .burgers(2)
                    .sauce(Sauce.BARBECUE)
                    .ingredient(Ingridients.BACON)
                    .ingredient(Ingridients.CHEESE)
                    .ingredient(Ingridients.ONION)
                    .ingredient(Ingridients.LETTUCE)
                    .build();
        System.out.println(bigmac);
        //When
    int howManyIngredients = bigmac.getIngredients().size();
        //Then
        Assert.assertEquals(4, howManyIngredients);
    }
}
