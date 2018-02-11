package com.kodilla.rps;

import org.apache.commons.lang3.StringUtils;

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
            //TODO how to convert InputStream to Readable
            RpsLogic rpsLogic = new RpsLogic(null, new Comp());
            rpsLogic.rpsRun(Integer.parseInt(rounds));
        } else {
            System.out.println(notNumeric());
            rps();
        }
    }
}