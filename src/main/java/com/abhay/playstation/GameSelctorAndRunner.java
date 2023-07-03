package com.abhay.playstation;

import com.abhay.playstation.games.GameConsole;

public class GameSelctorAndRunner {
	private GameConsole game;
	public GameSelctorAndRunner(GameConsole game) {
		this.game = game;
	}
	public void run() {
		System.out.println("Running game: " + game);
		game.up();
		game.down();
		game.left();
		game.right();
	}
}