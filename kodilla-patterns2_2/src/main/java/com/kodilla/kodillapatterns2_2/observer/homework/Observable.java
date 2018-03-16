package com.kodilla.kodillapatterns2_2.observer.homework;

public interface Observable {
    void registerObserver(Observer observer);
    void notifyObserver();
}
