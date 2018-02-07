package com.kodilla.patterns.factory.tasks;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class PaintingTask implements Task {
    private String taskName;
    private String colour;
    private String whatToPaint;

    Set<PaintingTask> paintingTasks = new HashSet<>();

    public PaintingTask(String taskName, String colour, String whatToPaint) {
        this.taskName = taskName;
        this.colour = colour;
        this.whatToPaint = whatToPaint;
    }

    @Override
    public void executeTask() {
        paintingTasks.add(this);

    }

    @Override
    public boolean isTaskExecuted() {
        if (paintingTasks.contains(this)) {
            return true;
        } else {
            return false;
        }
    }

    public String getTaskName() {
        return taskName;
    }


    public String getColour() {
        return colour;
    }

    public String getWhatToPaint() {
        return whatToPaint;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PaintingTask that = (PaintingTask) o;
        return Objects.equals(getTaskName(), that.getTaskName()) &&
                Objects.equals(getColour(), that.getColour()) &&
                Objects.equals(getWhatToPaint(), that.getWhatToPaint());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getTaskName(), getColour(), getWhatToPaint());
    }
}
