package com.kodilla.stream.array;

import com.sun.org.apache.xpath.internal.SourceTree;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Random;
import java.util.stream.IntStream;

public class ArrayOperationsTestSuite {

    @Test
    public void testGetAverage() {
        //Given
        int[] testArray = new int[20];
        Random r = new Random();
        for (int i = 0; i < testArray.length; i++) {
            testArray[i] = r.nextInt(401);
        }
        //When
    double average = ArrayOperations.getAverage(testArray);
        double sum = IntStream.range(0, testArray.length)
                .map(n -> testArray[n])
                .sum();
        //Then
        System.out.println(average);
        Assert.assertEquals(sum/testArray.length, average,0.01);
    }
}
