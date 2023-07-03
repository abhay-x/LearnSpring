package com.abhay.playstation;

import com.abhay.playstation.games.GameConsole;
import com.abhay.playstation.games.PacmanGame;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GamingConfiguration {

    @Bean
    public GameConsole game() {
        //GamingConsole marioGame = new MarioGame();
        //GamingConsole superContraGame = new SuperContraGame();
        GameConsole pacmanGame = new PacmanGame();
        return pacmanGame;
    }

    @Bean
    public GameSelctorAndRunner gameRunner(GameConsole game) {
        var gameRunner = new GameSelctorAndRunner(game);
        return gameRunner;
    }

}