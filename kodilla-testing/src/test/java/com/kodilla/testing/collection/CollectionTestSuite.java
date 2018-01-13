package com.kodilla.testing.collection;

import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static com.kodilla.testing.collection.OddNumbersExterminator.exterminate;

public class CollectionTestSuite {
    @Before
    public void before(){
        System.out.println("Test Case: begin");
    }
    @After
    public void after(){
        System.out.println("Test Case: end");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList() {
    //Given
        ArrayList<Integer> numbers = null;
    //When
        ArrayList<Integer>
        System.out.println("Testing " + result);
    //Then
        Assert.assertNull(result);
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {
    //Given

    //When

    //Then

    }
}
