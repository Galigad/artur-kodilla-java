package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {
    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";

    public final Task makeTask (final String taskClass) {
        switch (taskClass) {
            case SHOPPING:
                return new ShoppingTask("Make List", "bread", 2);
            case PAINTING:
                return new PaintingTask("Paint scene", "Blue and red", "Landscape");
            case DRIVING:
                return new DrivingTask("Learn to drive", "Rzeszow", "Dads car");
            default:
                return null;
        }
    }
}
