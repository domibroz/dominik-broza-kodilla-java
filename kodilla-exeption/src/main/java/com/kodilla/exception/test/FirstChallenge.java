package com.kodilla.exception.test;

public class FirstChallenge {

    public double divide(double a, double b) throws ArithmeticException{
        double result = 0.0;

        try {
            result = a / b;
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
        finally {
            System.out.println("End.");
        }
        return result;
    }

    public static void main(String[] args) {

        FirstChallenge firstChallenge = new FirstChallenge();

        double result = firstChallenge.divide(3, 0);

        System.out.println(result);

    }
}