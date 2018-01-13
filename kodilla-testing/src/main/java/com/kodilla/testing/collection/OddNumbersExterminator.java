package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.Random;

public class OddNumbersExterminator {

    {
        ArrayList<Integer> numbers = generatedNumbers();

        exterminate(numbers);

    }

    public static void exterminate(ArrayList<Integer> numbers) {
        int temp = 0;
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        for (int i = 0; i < numbers.size(); i++) {
            temp = numbers.get(i);
            if (temp % 2 == 0) {
                evenNumbers.add(temp);
            }
        }
    }

    public static ArrayList<Integer> generatedNumbers() {
        ArrayList<Integer> generatedNumbers = new ArrayList<>();
        Random generator = new Random();
        for (int n = 0; n < 100; n++) {
            generatedNumbers.add(generator.nextInt(100));
        }
        return generatedNumbers;
    }
}