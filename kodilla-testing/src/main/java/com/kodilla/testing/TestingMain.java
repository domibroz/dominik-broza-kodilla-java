package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args){
        Calculator calculator = new Calculator();

        if (calculator.add(3,3)==6){
            System.out.println("Add test OK");
        }
        else {
            System.out.println("Add test ERROR");
        }

        if (calculator.substract(3,2)==1){
            System.out.println("Add test OK");
        }
        else {
            System.out.println("Add test ERROR");
        }
    }
}
