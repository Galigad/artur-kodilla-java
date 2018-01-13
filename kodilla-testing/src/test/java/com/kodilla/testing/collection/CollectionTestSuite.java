package com.kodilla.testing.collection;

import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static com.kodilla.testing.collection.OddNumbersExterminator.exterminate;
import static com.kodilla.testing.collection.OddNumbersExterminator.generatedNumbers;

public class CollectionTestSuite {
    @Before
    public void before() {
        System.out.println("Test Case: begin");
    }

    @After
    public void after() {
        System.out.println("Test Case: end");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
    ArrayList<Integer> nullList = new ArrayList<>();
        //When
    ArrayList<Integer> result = exterminate(nullList);
        //Then
    Assert.assertEquals(0, result.size());
        System.out.println("Empty list test - OK!");
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        ArrayList<Integer> normalList = generatedNumbers();
        //When
        ArrayList<Integer> result = exterminate(normalList);
        //Then
        Assert.assertEquals(2, result.size());
        System.out.println("Normal list test - OK!");
    }
}
