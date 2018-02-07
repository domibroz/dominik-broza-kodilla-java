package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage(){
        int[] numbers = {10,10,10,10,10,10,10,10,10,10,1,2,3,4,5,6,7,8,9,10};

        double expectedAverage = 7.75;
        double actualAverage = ArrayOperations.getAverage(numbers);

        Assert.assertEquals(expectedAverage,actualAverage,0);
    }
}
