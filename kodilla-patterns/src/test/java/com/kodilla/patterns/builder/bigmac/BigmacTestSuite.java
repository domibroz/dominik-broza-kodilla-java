package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void testBigmacNew() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .roll(Roll.SESAME)
                .burgers(3)
                .sauce(Sauce.STANDARD)
                .ingredient(Ingredients.CUCUMBER)
                .ingredient(Ingredients.BECON)
                .ingredient(Ingredients.CHEESE)
                .build();
        System.out.println(bigmac);
        //When
        int howManyIngr = bigmac.getIngredients().size();
        //Then
        Assert.assertEquals(3, howManyIngr);
    }
}
