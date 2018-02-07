package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testNewShoppingTask() {
        TaskFactory factory = new TaskFactory();

        Task shopping = factory.newTask(TaskFactory.SHOPPING);
        shopping.executeTask();

        Assert.assertEquals("shopping", shopping.getTaskName());
        Assert.assertEquals(true, shopping.isTaskExecuted());
    }

    @Test
    public void testNewPaintingTask(){
        TaskFactory factory = new TaskFactory();

        Task painting = factory.newTask(TaskFactory.PAINTING);
        painting.executeTask();

        Assert.assertEquals("painting", painting.getTaskName());
        Assert.assertEquals(true, painting.isTaskExecuted());
    }

    @Test
    public void testNewDrivingTask(){
        TaskFactory factory = new TaskFactory();

        Task driving = factory.newTask(TaskFactory.DRIVING);
        driving.executeTask();

        Assert.assertEquals("driving", driving.getTaskName());
        Assert.assertEquals(true, driving.isTaskExecuted());
    }
}
