package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void testNewBigmac() {
        //Given
            Bigmac bigmac = new Bigmac.BigmacBuilder()
                    .roll(Bigmac.RollEnum.classic)
                    .burgers(2)
                    .sauce(Bigmac.SauceEnum.barbecue)
                    .ingredient(Bigmac.IngridientsEnum.bacon)
                    .ingredient(Bigmac.IngridientsEnum.cheese)
                    .ingredient(Bigmac.IngridientsEnum.onion)
                    .ingredient(Bigmac.IngridientsEnum.lettuce)
                    .build();
        System.out.println(bigmac);
        //When
    int howManyIngredients = bigmac.getIngredients().size();
        //Then
        Assert.assertEquals(4, howManyIngredients);
    }
}
