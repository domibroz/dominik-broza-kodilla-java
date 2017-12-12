package com.kodilla.testing.collection;

import org.junit.*;

import java.util.ArrayList;
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

        Assert.assertEquals(oddNumbers, numbers);
    }


    @Test
    public void testOddNumbersExterminatorNormalList(){
        List<Integer> numbers = new ArrayList<>();
        for(int i=0; i<10; i++){
            numbers.add(i);
        }
        List<Integer>oddNumbersTestList = new ArrayList<>();
        for (Integer number : numbers) {
            if (number % 2 == 0) {
                oddNumbersTestList.add(number);
            }
        }
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        List<Integer> oddNumbers = oddNumbersExterminator.exterminate(numbers);
        System.out.println("Testing Normal List");

        Assert.assertEquals(oddNumbers, oddNumbersTestList);


    }
}
