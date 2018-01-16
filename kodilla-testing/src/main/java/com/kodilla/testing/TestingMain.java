package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {

    public static void main(String[] args) {

        SimpleUser simpleUser = new SimpleUser("theForumUser", "Artur");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        Calculator calculator = new Calculator();

        int adding = calculator.add(5, 4);
        int substracting = calculator.substract(3, 7);

        System.out.println("Test - pierwszy test jednostkowy:");
        if (5 + 4 == adding && substracting == 3 - 7) {
            System.out.println("Adding OK");
        } else {
            System.out.println("Error!");
        }
        if (substracting == 3 - 7) {
            System.out.println("Substracting OK");
        } else {
            System.out.println("Error!");
        }
    }
}