package com.kodilla.rps;

public class RpsRunner {

    public static void main(String[] args) {
        UserDialogs.sayHello();
        Game game = new Game();
        game.initGame();
        boolean gameFinished = false;
        while (!gameFinished) {
            if(!game.playOneTurn()) {
                gameFinished = true;
            }
        }
        UserDialogs.sayGoodBye();
    }
}