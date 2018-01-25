package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main(String[] args) {
        SecondChallenge exercise = new SecondChallenge();
        try {
            exercise.probablyIWillThrowException(2.0, 2.0);
        } catch (Exception e) {
            System.out.println("Incorrect variables: " + e);
        } finally {
            System.out.println("Check variables range - x >= 2 || x < 1 || y == 1.5");
        }
    }
}
