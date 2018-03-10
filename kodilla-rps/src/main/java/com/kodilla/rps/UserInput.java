package com.kodilla.rps;

public class UserInput {
    final static String ROCK = "r";
    final static String PAPER = "p";
    final static String SCISSORS = "s";
    final static String EXIT = "x";
    final static String NEW_GAME = "n";
    final static String YES = "yes";
    final static String NO = "no";

    public static boolean isExit(String input) {
        return input.toLowerCase().equals(EXIT);
    }

    public static boolean isNewGame(String input) {
        return input.toLowerCase().equals(NEW_GAME);
    }

    public static boolean yesNo(String input) {
        switch (input.toLowerCase()) {
            case YES:
                return true;
            case NO:
                return false;
            default:
                return false;
        }

    }

    public static boolean isSupported(String input) {
        return input.toLowerCase().equals(ROCK)
                || input.toLowerCase().equals(PAPER)
                || input.toLowerCase().equals(SCISSORS)
                || input.toLowerCase().equals(EXIT);
    }

    public static Choice getUserChoice(String input) {
        switch (input.toLowerCase()) {
            case PAPER:
                return Choice.PAPER;
            case ROCK:
                return Choice.ROCK;
            default:
                return Choice.SCISSORS;
        }
    }

}
