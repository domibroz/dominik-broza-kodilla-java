package com.kodilla.patterns.factory.tasks;

import java.util.HashSet;
import java.util.Set;

public class TaskFactory {
    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";


    public final Task newTask(final String taskClass) {
        switch (taskClass) {
            case SHOPPING: {
                return new ShoppingTask("shopping", "milk", 2.0);
            }
            case PAINTING: {
                return new PaintingTask("painting", "blue", "living room");
            }
            case DRIVING: {
                return new DrivingTask("driving", "home", "car");
            }
            default:
                return null;
        }
    }

}
