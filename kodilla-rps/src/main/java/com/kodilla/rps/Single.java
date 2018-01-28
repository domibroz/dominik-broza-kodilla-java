package com.kodilla.rps;


public class Single {
    public SingleResult run(Choice userChoice, Choice compChoice) {
        if (userChoice.equals(Choice.PAPER) && compChoice.equals(Choice.PAPER)) {
            return SingleResult.draw();
        } else if (userChoice.equals(Choice.PAPER) && compChoice.equals(Choice.ROCK)) {
            return SingleResult.user();
        } else if (userChoice.equals(Choice.PAPER) && compChoice.equals(Choice.SCISSORS)) {
            return SingleResult.comp();
        } else if (userChoice.equals(Choice.ROCK) && compChoice.equals(Choice.PAPER)) {
            return SingleResult.comp();
        } else if (userChoice.equals(Choice.ROCK) && compChoice.equals(Choice.ROCK)) {
            return SingleResult.draw();
        } else if (userChoice.equals(Choice.ROCK) && compChoice.equals(Choice.SCISSORS)) {
            return SingleResult.user();
        } else if (userChoice.equals(Choice.SCISSORS) && compChoice.equals(Choice.PAPER)) {
            return SingleResult.user();
        } else if (userChoice.equals(Choice.SCISSORS) && compChoice.equals(Choice.ROCK)) {
            return SingleResult.comp();
        } else {
            return SingleResult.draw();
        }
    }
}
