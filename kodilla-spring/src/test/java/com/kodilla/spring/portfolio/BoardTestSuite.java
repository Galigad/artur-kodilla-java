package com.kodilla.spring.portfolio;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BoardTestSuite {
    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        //When
        board.toDoList.tasks.add("Cook dinner");
        board.inProgressList.tasks.add("Peal potatoes");
        board.doneList.tasks.add("Do shopping");
        //Then
        System.out.println("To do list: " + board.toDoList.tasks);
        System.out.println("In progress list: " + board.inProgressList.tasks);
        System.out.println("Done list: " + board.doneList.tasks);
    }
}