package com.kodilla.kodillapatterns2_2.observer.homework;

public class Mentor implements Observer {
    private final String name;
    private int homeworksCounter;

    public Mentor(String name) {
        this.name = name;
    }

    @Override
    public void update(User user) {
        System.out.println("New homework from: " + user.getName() + "\n" + "You have: " +
                user.getHomeworks().size() + " homeworks to check from this user");
        homeworksCounter++;
    }

    public String getName() {
        return name;
    }

    public int getHomeworksCounter() {
        return homeworksCounter;
    }
}
