package com.skilldistillery.cards.blackjack;

import java.util.Scanner;

public class GameDriver {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.println("Welcome, gambler. What's your name?");
		String name = kb.next();
		System.out.println(name + ", huh? Well, let's get started.");

		System.out.println("You are dealt:");
		Hand.fillHand();
		// play again loop
		System.out.println("Would you like to hit, stay, or quit? (H/S/Q)");
		String choice = kb.next();
		do {
		if (choice == "H") {
			Hand.hitMe();
		}
		else if (choice == "S") {
			Table.stay();
			
		}
		
		} while(choice == "Q");
		System.out.println("A sore loser, eh? Well, we don't like your kind around these parts.");
		kb.close();
	}

}
/*
 * Greeting / name Game prompts (stay, hold)
 * 
 */
