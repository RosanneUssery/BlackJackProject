package com.skilldistillery.cards.blackjack;

import java.util.Scanner;

public class Dealer {
	public static int startGamePlayDealer() {
		
		int dealerScore = 0;
		System.out.println("Dealer deals itself:");
		dealerScore = Hand.fillHand();
		System.out.println("Their score is " + dealerScore);
		return dealerScore;
		//String choice = null;

	}
	public static boolean stand() {
		boolean dStand = true;
		System.out.println("Dealer stands.");
		return dStand;
	}
	
	
}
