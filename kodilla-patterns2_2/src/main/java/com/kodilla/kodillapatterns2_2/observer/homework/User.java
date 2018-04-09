package com.kodilla.kodillapatterns2_2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class User implements Observable {
    private final List<Observer> observers;
    private final List<String> homeworks;
    private final String name;

    public User(String name) {
        observers = new ArrayList<>();
        homeworks = new ArrayList<>();
        this.name = name;
    }

    public void newHomework(String homework) {
        homeworks.add(homework);
        notifyObserver();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.update(this);
        }

    }

    public List<String> getHomeworks() {
        return homeworks;
    }

    public String getName() {
        return name;
    }
}
