package com.kodilla.rps;


public class Single {
    public SingleResult run(Choice userChoice, Choice compChoice) {
        if (userChoice.equals(compChoice)) {
            return SingleResult.draw();
        }
        if (userChoice.won(compChoice)) {
            return SingleResult.user();
        }
        return SingleResult.comp();    }
}
