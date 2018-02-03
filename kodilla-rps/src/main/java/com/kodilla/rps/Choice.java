package com.kodilla.rps;

public enum Choice {
    ROCK,
    PAPER,
    SCISSORS;

    boolean won(Choice other) {
        return (this == ROCK && other == SCISSORS) ||
                (this == PAPER && other == ROCK) ||
                (this == SCISSORS && other == PAPER);
    }
}
