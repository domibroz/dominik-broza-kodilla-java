package com.kodilla.patterns.factory.tasks;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class ShoppingTask implements Task {
    private String taskName;
    private String whatToBuy;
    private double quantity;

    Set<ShoppingTask> shoppingTasks = new HashSet<>();

    public ShoppingTask(String taskName, String whatToBuy, double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }

    @Override
    public void executeTask() {
        shoppingTasks.add(this);
    }

    @Override
    public boolean isTaskExecuted() {
        if (shoppingTasks.contains(this)) {
            return true;
        } else {
            return false;
        }
    }

    public String getTaskName() {
        return taskName;
    }


    public String getWhatToBuy() {
        return whatToBuy;
    }

    public double getQuantity() {
        return quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ShoppingTask that = (ShoppingTask) o;
        return Double.compare(that.getQuantity(), getQuantity()) == 0 &&
                Objects.equals(getTaskName(), that.getTaskName()) &&
                Objects.equals(getWhatToBuy(), that.getWhatToBuy());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getTaskName(), getWhatToBuy(), getQuantity());
    }
}
