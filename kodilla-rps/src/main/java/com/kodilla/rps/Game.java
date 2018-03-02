package com.kodilla.rps;

import java.util.Random;

public class Game {

    private String player1;
    private String player2;
    private int player1Wins;
    private int player2Wins;
    private int rounds;

    public int getRounds() {
        return rounds;
    }

    public String getPlayer1() {
        return player1;
    }

    public String getPlayer2() {
        return player2;
    }

    public int getPlayer1Wins() {
        return player1Wins;
    }

    public int getPlayer2Wins() {
        return player2Wins;
    }

    public void initGame() {
        player1 = UserDialogs.getPlayerName();
    }

    public void showStatistic() {
        System.out.println("Player 1: " + player1);
        System.out.println("Player 2: computer");
        System.out.println("Player 1 points: " + player1Wins);
        System.out.println("Player 2 points: " + player2Wins);
        System.out.println("Rounds: " + rounds);
    }

    public boolean playOneTurn() {
        String player1Play = UserDialogs.getPlayerSelection();
        if (player1Play.equals("X")) {
            return false;
        }
        String player2Play = computerMove();
        System.out.println("Player 1 selected: " + player1Play);
        System.out.println("Player 2 selected: " + player2Play);
        String winner = whoWins(player1Play, player2Play);
        if(winner.equals("P1")) {
            player1Wins++;
            System.out.println("Player 1 wins!");
        } else if (winner.equals("P2")) {
            player2Wins++;
            System.out.println("Player 2 wins!");
        } else {
            System.out.println("TIE!");
        }
        rounds++;
        showStatistic();
        return true;
    }

    private String whoWins(String player1Play, String player2Play) {
        if (player1Play.equals("R")) {
            if (player2Play.equals("R")) {
                return "TIE";
            } else if (player2Play.equals("S")) {
                return "P1";
            } else {
                return "P2";
            }
        } else if (player1Play.equals("S")) {
            if (player2Play.equals("S")) {
                return "TIE";
            } else if (player2Play.equals("P")) {
                return "P1";
            } else {
                return "P2";
            }
        } else {
            if (player2Play.equals("P")) {
                return "TIE";
            } else if (player2Play.equals("R")) {
                return "P1";
            } else {
                return "P2";
            }
        }
    }

    private String computerMove() {
        Random random = new Random();
        String[] s = {"R", "S", "P"};
        return s[random.nextInt(3)];
    }
}
