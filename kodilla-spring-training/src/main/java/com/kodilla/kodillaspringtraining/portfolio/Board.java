package com.kodilla.kodillaspringtraining.portfolio;

public class Board {
    TaskList toDoList;
    TaskList inProgressList;
    TaskList doneList;

    public Board(TaskList toDoList, TaskList inProgressList, TaskList doneList) {
        this.toDoList = toDoList;
        this.inProgressList = inProgressList;
        this.doneList = doneList;
    }

    public void addTaskToDoList(String task){
        toDoList.tasks.add(task);
    }

    public void addTaskInProgressList(String task){
        inProgressList.tasks.add(task);
    }

    public void addTaskDoneList(String task){
        doneList.tasks.add(task);
    }

    public TaskList getToDoList() {
        return toDoList;
    }

    public TaskList getInProgressList() {
        return inProgressList;
    }

    public TaskList getDoneList() {
        return doneList;
    }
}
