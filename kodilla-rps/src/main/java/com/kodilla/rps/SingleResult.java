package com.kodilla.rps;

public class SingleResult {
    private int result;

    public static SingleResult draw() {
        SingleResult s = new SingleResult();
        s.result = 0;
        return s;
    }

    public static SingleResult user() {
        SingleResult s = new SingleResult();
        s.result = 1;
        return s;
    }

    public static SingleResult comp() {
        SingleResult s = new SingleResult();
        s.result = -1;
        return s;
    }

    public boolean userWon() {
        return result == 1;
    }

    public boolean isDraw() {
        return result == 0;
    }
}
