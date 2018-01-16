package com.kodilla.testing.shape;

import com.kodilla.testing.shape.Shape;

import java.util.ArrayList;

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
