package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.Random;

public class OddNumbersExterminator {

    {
        ArrayList<Integer> numbers = generatedNumbers();

        exterminate(numbers);

    }

    public static ArrayList<Integer> exterminate(ArrayList<Integer> numbers) {
        int temp = 0;
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        for (int i = 0; i < numbers.size(); i++) {
            temp = numbers.get(i);
            if (temp % 2 == 0) {
                evenNumbers.add(temp);
            }
        }
        return evenNumbers;
    }

    public static ArrayList<Integer> generatedNumbers() {
        ArrayList<Integer> generatedNumbers = new ArrayList<>();
        generatedNumbers.add(1);
        generatedNumbers.add(2);
        generatedNumbers.add(3);
        generatedNumbers.add(4);
        generatedNumbers.add(5);

        return generatedNumbers;
    }
}