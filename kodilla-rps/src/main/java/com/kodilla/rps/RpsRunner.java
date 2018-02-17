package com.kodilla.rps;

import org.apache.commons.lang3.StringUtils;

import java.io.InputStreamReader;
import java.util.Scanner;

import static com.kodilla.rps.Notifications.*;

public class RpsRunner {
    public static void main(String[] args) {
        rps();
    }

    public static void rps() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(welcome());
        String name = scanner.nextLine();
        System.out.println(rounds(name));
        String rounds = scanner.nextLine();
        if (StringUtils.isNumeric(rounds)) {
            System.out.println(instructions());
            RpsLogic rpsLogic = new RpsLogic(new InputStreamReader(System.in), new Comp());
            rpsLogic.rpsRun(Integer.parseInt(rounds));
        } else {
            System.out.println(notNumeric());
            rps();
        }
    }
}