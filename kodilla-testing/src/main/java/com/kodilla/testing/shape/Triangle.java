package com.kodilla.testing.shape;

import com.kodilla.testing.shape.Shape;

class Triangle implements Shape {

    public String getShapeName() {
        String triangleName = "Triangle";
        return triangleName;
    }

    public double getField() {
        double a = 4, h = 3;
        double triagnleField = 0.5 * (a * h);
        System.out.println(triagnleField);
        return triagnleField;
    }
}