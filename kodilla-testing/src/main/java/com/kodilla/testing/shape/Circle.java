package com.kodilla.testing.shape;

import com.kodilla.testing.shape.Shape;

class Circle implements Shape {
    public String getShapeName() {
        String circleName = "Circle";
        return circleName;
    }

    public double getField() {
        double r = 3, Pi = 3.14;
        double circleField = Pi*(r*r);
        System.out.println(circleField);
        return circleField;
    }
}