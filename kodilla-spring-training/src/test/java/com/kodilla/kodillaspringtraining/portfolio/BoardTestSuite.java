package com.kodilla.kodillaspringtraining.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BoardTestSuite {
    @Test
    public void testAddTask() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        //When
        board.addTaskToDoList("Zrob pranie");
        board.addTaskInProgressList("Zrob pranie");
        board.addTaskDoneList("Zrob pranie");
        boolean result =  board.getToDoList().getTasks().contains("Zrob pranie");
        //Then
        Assert.assertEquals(result,true);
    }
}
