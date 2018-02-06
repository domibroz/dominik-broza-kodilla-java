package com.kodilla.patterns.factory.tasks;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class DrivingTask implements Task {
    private String taskName;
    private String where;
    private String using;

    Set<DrivingTask> drivingTasks = new HashSet<>();

    public DrivingTask(String taskName, String where, String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    @Override
    public void executeTask() {
        drivingTasks.add(this);
    }

    @Override
    public boolean isTaskExecuted() {
        if (drivingTasks.contains(this)) {
            return true;
        } else {
            return false;
        }
    }

    public String getTaskName() {
        return taskName;
    }


    public String getWhere() {
        return where;
    }

    public String getUsing() {
        return using;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DrivingTask that = (DrivingTask) o;
        return Objects.equals(getTaskName(), that.getTaskName()) &&
                Objects.equals(getWhere(), that.getWhere()) &&
                Objects.equals(getUsing(), that.getUsing());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getTaskName(), getWhere(), getUsing());
    }
}
