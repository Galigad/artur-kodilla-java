package com.kodilla.spring.calculator;

import com.kodilla.spring.shape.Shape;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {
    @Test
    public void testCalculations() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double testAdd = calculator.add(3,5);
        double testSub = calculator.sub(4,5);
        double testMul = calculator.mul(2,7);
        double testDiv = calculator.div(6,8);
        //Then
        Assert.assertEquals(8, testAdd, 0.0);
        Assert.assertEquals(-1, testSub, 0.0);
        Assert.assertEquals(14, testMul, 0.0);
        Assert.assertEquals(0.75, testDiv, 0.0);
}
}
