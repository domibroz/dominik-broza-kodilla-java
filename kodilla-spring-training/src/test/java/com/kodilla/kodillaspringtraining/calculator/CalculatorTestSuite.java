package com.kodilla.kodillaspringtraining.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import static jdk.nashorn.internal.objects.Global.Infinity;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {
    @Test
    public void calculationTest(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.kodillaspringtraining.calculator");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double expectedAdd = calculator.add(2,2);
        double expectedSub = calculator.sub(3,2);
        double expectedMul = calculator.mul(2,2);
        double expectedDiv = calculator.div(4,2);
        double expectedDivByZero = calculator.div(2,0);
        //Then
        Assert.assertEquals(4,expectedAdd,0);
        Assert.assertEquals(1,expectedSub,0);
        Assert.assertEquals(4, expectedMul,0);
        Assert.assertEquals(2, expectedDiv,0);
        Assert.assertEquals(Infinity,expectedDivByZero,0);
    }
}
