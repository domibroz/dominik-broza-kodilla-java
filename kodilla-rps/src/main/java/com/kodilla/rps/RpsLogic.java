package com.kodilla.rps;

import java.util.Scanner;

import static com.kodilla.rps.Notifications.*;

public class RpsLogic {
    Readable userInput;
    Challenger challenger;

    public RpsLogic(Readable userInput, Challenger challenger) {
        this.userInput = userInput;
        this.challenger = challenger;
    }

    public void rpsRun(int rounds) {
        boolean end = false;
        int user = 0;
        int comp = 0;
        Scanner scanner = new Scanner(userInput);
        while (!end) {
            System.out.println(yourTurn());
            String userTurn = scanner.nextLine();
            if (UserInput.isExit(userTurn)) {
                System.out.println(exit());
                String s = scanner.nextLine();
                if (UserInput.yesNo(s)) {
                    end = true;
                }
            } else if (UserInput.isNewGame(userTurn)) {
                System.out.println(newGame());
                String s = scanner.nextLine();
                if (UserInput.yesNo(s)) {
                    System.out.println();
                    end = true;
                    RpsRunner.rps();
                }
            } else if (!UserInput.isSupported(userTurn)) {
                System.out.println(unsupportedInput());
            } else {
                Choice userChoice = UserInput.getUserChoice(userTurn);
                Choice compChoice = challenger.getChoice();
                Single single = new Single();
                SingleResult result = single.run(userChoice, compChoice);
                System.out.println(singleResultInfo(userChoice, compChoice));
                if (result.isDraw()) {
                    System.out.println(drawRound());
                } else if (result.userWon()) {
                    user++;
                    System.out.println(userRoundWon());
                    end = isGameCompleted(rounds, user, Player.USER);
                } else {
                    comp++;
                    System.out.println(compRoundWon());
                    end = isGameCompleted(rounds, comp, Player.COMPUTER);
                }
            }
        }
    }

    public boolean isGameCompleted(int rounds, int playerResult, Player player) {
        if (playerResult >= rounds) {
            if (player.equals(Player.USER)) {
                System.out.println(userGameWon());
                return true;
            } else {
                System.out.println(compGameWon());
                return true;
            }

        } else {
            return false;
        }
    }

}
