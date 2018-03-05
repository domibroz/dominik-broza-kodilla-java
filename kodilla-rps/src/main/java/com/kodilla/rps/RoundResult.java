package com.kodilla.rps;

import java.util.Objects;

public class RoundResult {
    private int result;

    public static RoundResult draw() {
        RoundResult s = new RoundResult();
        s.result = 0;
        return s;
    }

    public static RoundResult user() {
        RoundResult s = new RoundResult();
        s.result = 1;
        return s;
    }

    public static RoundResult comp() {
        RoundResult s = new RoundResult();
        s.result = -1;
        return s;
    }

    public boolean userWon() {
        return result == 1;
    }

    public boolean isDraw() {
        return result == 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RoundResult that = (RoundResult) o;
        return result == that.result;
    }

    @Override
    public int hashCode() {

        return Objects.hash(result);
    }
}
