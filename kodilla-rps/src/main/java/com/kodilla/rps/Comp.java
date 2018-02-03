package com.kodilla.rps;

import java.util.Random;

public class Comp {
    private static Random r = new Random();

    private static int generate() {
        return r.nextInt(3) + 1;
    }

    public static Choice compChoice() {
        int val = generate();

        if (val == 1) {
            return Choice.PAPER;
        } else if (val == 2) {
            return Choice.ROCK;
        } else {
            return Choice.SCISSORS;
        }
    }
}
