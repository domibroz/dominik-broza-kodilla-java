package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main(String[] args) {
        SecondChallenge secondChallenge = new SecondChallenge();
        try {
            secondChallenge.probablyIWillThrowException(2,1.5);
        } catch (Exception e) {
            System.out.println("x >= 2 || x < 1 || y == 1.5. Use different numbers.");
        }finally {
            System.out.println("End.");
        }
    }
}
