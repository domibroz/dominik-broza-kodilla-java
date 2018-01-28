package com.kodilla.rps;

import java.util.Random;

public class Comp {
    public int generator() {
        Random generator = new Random();
        return generator.nextInt(2) + 1;
    }

    public static Choice compChoice() {
        Comp comp = new Comp();
        if (comp.generator() == 1) {
            return Choice.PAPER;
        } else if (comp.generator() == 2) {
            return Choice.ROCK;
        } else {
            return Choice.SCISSORS;
        }
    }
}
