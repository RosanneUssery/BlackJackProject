package com.skilldistillery.cards.blackjack;

import java.util.Scanner;

public class Dealer {
	static boolean dWin = false;
	public static int startGamePlayDealer() {
		
		int dealerScore = 0;
		System.out.println("Dealer deals itself:");
		dealerScore = Hand.fillHand();
		System.out.println("Their score is " + dealerScore);
		if (dealerScore == 21) {
			dWin = true;
		}
		return dealerScore;
		//String choice = null;

	}
	public static boolean stand() {
		boolean dStand = true;
		System.out.println("Dealer stands.");
		return dStand;
	}
	
	public boolean dWins() {
		dWin = true;
		return dWin;
		
	}
	
}
