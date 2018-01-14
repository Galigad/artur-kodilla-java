package com.kodilla.testing.shape;

import java.util.ArrayList;

public interface Shape {

    String getShapeName();

    double getField();

}

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

class ShapeCollector {

    ArrayList<Shape> geometricShapes = new ArrayList<>();

    public void addFigure(Shape shape) {
        geometricShapes.add(shape);
    }

    public void removeFigure(Shape shape) {
        geometricShapes.remove(shape);
    }

    public Shape getFigure(int n) {
        return geometricShapes.get(n);
    }

    public void showFigures() {
        for (int i = 0; i < geometricShapes.size(); i++) {
            System.out.println(getFigure(i).getShapeName());
    }
    }
}
