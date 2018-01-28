package com.kodilla.rps;

public class Notifications {
    public static String welcome() {
        return ("Hi! This is a Rock Paper Scissors game. What is your name?");
    }

    public static String rounds(String name) {
        return ("Hi " + name + "! " + "Let me know how many won round will make you the winner?");
    }

    public static String instructions() {
        return ("OK! So, this is how to play: \n" +
                "r - ROCK \n" +
                "p - PAPER \n" +
                "s - SCISSORS \n" +
                "x - END \n" +
                "n - NEW GAME");
    }

    public static String yourTurn() {
        return ("Now it is your turn!: ");
    }

    public static String unsupportedInput() {
        return "Wrong input!";
    }

    public static String singleResultInfo(Choice userChoice, Choice compChoice) {
        return ("User: " + userChoice.toString() + " Computer: " + compChoice.toString());
    }

    public static String newGame() {
        return "Are you sure to start a new game? [YES/NO]";
    }

    public static String exit() {
        return "Are you sure to exit? [YES/NO]";
    }

    public static String notNumeric() {
        return "Rounds must be numeric!";
    }

    public static String userRoundWon() {
        return "This round won you!";
    }


    public static String compRoundWon() {
        return "This round won computer!";
    }

    public static String drawRound() {
        return "DRAW!";
    }

    public static String userGameWon() {
        return "You won the game!";
    }

    public static String compGameWon() {
        return "Computer won the game!";
    }

}
