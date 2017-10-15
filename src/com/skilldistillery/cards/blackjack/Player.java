package com.skilldistillery.cards.blackjack;

import java.util.Scanner;

public class Player {
	

public static int startGamePlay() {
	int score = 0;

	System.out.println("You are dealt:");
	score = Hand.fillHand();
	System.out.println("Your score is " + score);

	return score;

}
public static void stand() {
	System.out.println("You stand.");
	
}
}
