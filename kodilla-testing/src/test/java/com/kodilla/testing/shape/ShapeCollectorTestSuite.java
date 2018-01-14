package com.kodilla.testing.shape;

import org.junit.*;

public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("Starting tests:");
    }

    @AfterClass
    public static void afterAllTest() {
        System.out.println("All tests has ended.");
    }

    @Test
    public void testAddFigure() {
        //Given
        ShapeCollector shape = new ShapeCollector();
        Circle circle = new Circle();
        shape.addFigure(circle);
        //When
        Shape figure = shape.getFigure(0);
        //Then
        Assert.assertEquals(circle, figure);
    }

    @Test
    public void testRemoveFigure() {
        //Given
        ShapeCollector shape = new ShapeCollector();
        Square square = new Square();
        Circle circle = new Circle();
        //When
        shape.addFigure(square);
        shape.addFigure(circle);
        shape.removeFigure(square);
        int listSize = shape.geometricShapes.size();
        //Then
        Assert.assertEquals(1, listSize);
    }

    @Test
    public void testGetFigure() {
        //Given
        ShapeCollector shape = new ShapeCollector();
        Triangle triangle = new Triangle();
        Circle circle = new Circle();
        shape.addFigure(triangle);
        shape.addFigure(circle);
        //When
        Shape figure = shape.getFigure(1);
        //Then
        Assert.assertEquals(figure, circle);

    }

    @Test
    public void testShowFigures() {
        //Given
        ShapeCollector shape = new ShapeCollector();
        Circle circle = new Circle();
        //When
        shape.addFigure(circle);
        //Then
        shape.showFigures();
    }
}