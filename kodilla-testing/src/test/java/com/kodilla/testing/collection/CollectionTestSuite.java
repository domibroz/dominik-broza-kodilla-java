package com.kodilla.testing.collection;

import org.junit.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionTestSuite {
    @BeforeClass
    public static void beforeClass(){
        System.out.println("Test Suite: begin");
    }
    @AfterClass
    public static void afterClass(){
        System.out.println("Test Suite: end");
    }
    @Before
    public void before(){
        System.out.println("Test Case: begin");

    }
    @After
    public void after(){
        System.out.println("Test Case: end");
    }
    @Test
    public void testOddNumbersExterminatorEmptyList(){
        List<Integer> numbers = new ArrayList<>();
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        List<Integer> oddNumbers = oddNumbersExterminator.exterminate(numbers);
        System.out.println("Testing Empty List");

        Assert.assertTrue(oddNumbers.isEmpty());
    }


    @Test
    public void testOddNumbersExterminatorNormalList(){
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        List<Integer>expectedNumbers = Arrays.asList(2,4,6,8,10);

        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        List<Integer> actualNumbers = oddNumbersExterminator.exterminate(numbers);
        System.out.println("Testing Normal List");

        Assert.assertEquals(expectedNumbers, actualNumbers);


    }
}
