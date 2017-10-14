package com.skilldistillery.cards.blackjack;

import java.util.Scanner;

public class GameDriver {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.println("Welcome, gambler. What's your name?");
		String name = kb.next();
		System.out.println(name + ", huh? Are you ready to play? (Y/N)");
		String ready = kb.next();
		int score = 0;

		if (ready.equals("Y")) {
			System.out.println("You are dealt:");
			score = Hand.fillHand();
			String choice = null;
			// play again loop
			do {
				System.out.println("Would you like to hit, stay, or quit? (H/S/Q)");
				choice = kb.next();
				if (choice.equals("H")) {
					score = Hand.hitMe(score);
					if (score > 21) {
						continue;
					}
					System.out.println("Your score is: " + score);

				} else {
					Table.stay();
					break;
				}

			} while (choice.equals("H"));
		} else {
			System.out.println("A sore loser, eh? Well, we don't like your kind around these parts.");
			kb.close();
		}
	}
}
/*
 * Greeting / name Game prompts (stay, hold)
 * 
 */
