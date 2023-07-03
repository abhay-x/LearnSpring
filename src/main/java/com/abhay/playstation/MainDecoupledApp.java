package com.abhay.playstation;

import com.abhay.playstation.games.GameConsole;
import com.abhay.playstation.games.PacmanGame;

public class MainDecoupledApp {
    public static void main(String[] args) {
        //1: Object Creation
        //GamingConsole game = new MarioGame();
        //GamingConsole game = new SuperContraGame();
        GameConsole game = new PacmanGame();

        //2: Object Creation + Wiring of Dependencies
        // Game is a Dependency of GameRunner
        GameSelctorAndRunner gameRunner = new GameSelctorAndRunner(game);
        gameRunner.run();
    }
}

//