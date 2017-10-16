package com.skilldistillery.cards.blackjack;

import java.util.Scanner;

public class Player {
	static boolean win = false;
	public static boolean isWin() {
		return win;
	}
	public boolean isLose() {
		return lose;
	}
	public static void setWin(boolean win) {
		Player.win = win;
	}
	public void setLose(boolean lose) {
		this.lose = lose;
	}

	static boolean lose = false;

public static int startGamePlay() {
	int score = 0;

	System.out.println("You are dealt:");
	score = Hand.fillHand();
	System.out.println("Your score is " + score);

	return score;

}
public static boolean stand() {
	boolean pStand = true;
	System.out.println("You stand.");
	return pStand;
	
}
public boolean wins() {
	win = true;
	return win;
	
}

public boolean loses() {
	lose = true;
	return lose;
}
}
