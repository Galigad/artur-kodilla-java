package com.kodilla.rps;

import java.util.Scanner;

public class UserDialogs {

    public static void sayHello() {
        System.out.println("Welcome in RPS game");
    }

    public static String getPlayerName() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter your name: ");
            String s = scanner.nextLine();
            if (s.length() > 0) {
                return s;
            }
        }
    }

    public static void sayGoodBye() {
        System.out.println("Thank you for game!");
    }

    public static String getPlayerSelection() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Select: (R)ock, (S)cissors, (P)aper or X to exit");
            String s = scanner.nextLine().toUpperCase();
            switch (s) {
                case "R": return "R";
                case "S": return "S";
                case "P": return "P";
                case "X": return "X";
            }
            System.out.println("Wrong selection");
        }
    }
}
