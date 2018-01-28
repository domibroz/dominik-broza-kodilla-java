package com.kodilla.rps;

import java.util.Scanner;

import static com.kodilla.rps.Notifications.*;

public class RpsLogic {
    public static void rpsRun(int rounds) {
        boolean end = false;
        int user = 0;
        int comp = 0;
        Scanner scanner = new Scanner(System.in);
        while (!end) {
            System.out.println(yourTurn());
            String userTurn = scanner.nextLine();
            if (UserInput.unsupported(userTurn) && !UserInput.isExit(userTurn) && !UserInput.isNewGame(userTurn)) {
                Choice userChoice = UserInput.getUserChoice(userTurn);
                Choice compChoice = Comp.compChoice();
                Single single = new Single();
                SingleResult result = single.run(userChoice, compChoice);
                System.out.println(singleResultInfo(userChoice, compChoice));
                if (result.userWon() && !result.isDraw()) {
                    user++;
                    System.out.println(userRoundWon());
                    end = allRounds(rounds, user, "user");
                } else if(!result.userWon() && !result.isDraw()) {
                    comp++;
                    System.out.println(compRoundWon());
                    end = allRounds(rounds, comp, "computer");
                }else{
                    System.out.println(drawRound());
                }
            } else if (!UserInput.unsupported(userTurn)) {
                System.out.println(unsupportedInput());
            } else if (UserInput.isNewGame(userTurn)) {
                System.out.println(newGame());
                String s = scanner.nextLine();
                if (UserInput.yesNo(s)) {
                    System.out.println();
                    end = true;
                    RpsRunner.rps();
                }

            } else if (UserInput.isExit(userTurn)) {
                System.out.println(exit());
                String s = scanner.nextLine();
                if (UserInput.yesNo(s)) {
                    end = true;
                }
            }
        }

    }

    public static boolean allRounds(int rounds, int playerResult, String player) {
        if (playerResult >= rounds) {
            if (player.equals("user")) {
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
