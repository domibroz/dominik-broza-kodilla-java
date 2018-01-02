package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage(){
        int[] numbers = {10,10,10,10,10,10,10,10,10,10};

        double expectedAverage = 10.0;
        double actualAverage = ArrayOperations.getAverage(numbers);

        Assert.assertEquals(expectedAverage,actualAverage,0);
    }
}
