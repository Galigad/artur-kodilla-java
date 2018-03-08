package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testShoppingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task shopping = factory.makeTask(TaskFactory.SHOPPING);
        shopping.executeTask();
        //Then
        Assert.assertFalse(shopping.isTaskExecuted());
        Assert.assertEquals("Make List", shopping.getTaskName());
    }
    @Test
    public void testDrivingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task driving = factory.makeTask(TaskFactory.DRIVING);
        driving.executeTask();
        //Then
        Assert.assertTrue(driving.isTaskExecuted());
        Assert.assertEquals("Learn to drive", driving.getTaskName());
    }
    @Test
    public void testPaintingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task painting = factory.makeTask(TaskFactory.PAINTING);
        painting.executeTask();
        //Then
        Assert.assertTrue(painting.isTaskExecuted());
        Assert.assertEquals("Paint scene", painting.getTaskName());
    }
}