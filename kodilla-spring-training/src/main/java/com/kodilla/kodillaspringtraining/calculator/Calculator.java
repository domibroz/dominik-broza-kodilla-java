package com.kodilla.kodillaspringtraining.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import static jdk.nashorn.internal.objects.Global.Infinity;

@Component
public class Calculator {
    @Autowired
    Display display;

    public double add(double a, double b) {
        double val = a + b;
        display.displayValue(val);
        return val;
    }

    public double sub(double a, double b) {
        double val = a - b;
        display.displayValue(val);
        return val;
    }

    public double mul(double a, double b) {
        double val = a * b;
        display.displayValue(val);
        return val;
    }

    public double div(double a, double b){
        try {
            double val = a / b;
            display.displayValue(val);
            return val;
        }catch (ArithmeticException e){
            System.err.println("You can't divide by 0");
            return Infinity;
        }
    }
}
