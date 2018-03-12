package com.kodilla.rps;


public class Round {
    public RoundResult run(Choice userChoice, Choice compChoice) {
        if (userChoice.equals(compChoice)) {
            return RoundResult.draw();
        }
        if (userChoice.won(compChoice)) {
            return RoundResult.user();
        }
        return RoundResult.comp();    }
}
