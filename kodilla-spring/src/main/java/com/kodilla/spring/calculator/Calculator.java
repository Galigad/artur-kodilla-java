package com.kodilla.spring.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Calculator {

    double result;
    @Autowired
    Display display;


    double add(double a, double b) {
        result = a + b;
        System.out.print("Result of add = ");
        display.displayValue(result);
        return result;
    }
    double sub(double a, double b) {
        result = a - b;
        System.out.print("Result of sub = ");
        display.displayValue(result);
        return result;
    }
    double mul(double a, double b) {
        result = a * b;
        System.out.print("Result of mul = ");
        display.displayValue(result);
        return result;
    }
    double div(double a, double b) {
        result = a / b;
        System.out.print("Result of div = ");
        display.displayValue(result);
        return result;
    }
}
