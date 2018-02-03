package com.kodilla.rps;

import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

import static com.kodilla.rps.Notifications.*;
import static com.kodilla.rps.RpsLogic.*;

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
            rpsRun(Integer.parseInt(rounds));
        } else {
            System.out.println(notNumeric());
            rps();
        }
    }
}