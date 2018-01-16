package com.kodilla.testing.shape;

import com.kodilla.testing.shape.Shape;

class Square implements Shape {
    public String getShapeName() {
        String squareName = "Square";
        return squareName;
    }

    public double getField() {
        int a = 5;
        int squareField = a*a;
        System.out.println(squareField);
        return squareField;
    }
}