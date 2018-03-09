package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void testNewBigmac() {
        //Given
            Bigmac bigmac = new Bigmac.BigmacBuilder()
                    .roll(Roll.classic)
                    .burgers(2)
                    .sauce(Sauce.barbecue)
                    .ingredient(Ingridients.bacon)
                    .ingredient(Ingridients.cheese)
                    .ingredient(Ingridients.onion)
                    .ingredient(Ingridients.lettuce)
                    .build();
        System.out.println(bigmac);
        //When
    int howManyIngredients = bigmac.getIngredients().size();
        //Then
        Assert.assertEquals(4, howManyIngredients);
    }
}
