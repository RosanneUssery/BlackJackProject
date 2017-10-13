package com.skilldistillery.cards.blackjack;

import java.util.Scanner;

public class GameDriver {
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.println("Welcome, gambler. What's your name?");
		String name = kb.next();
		System.out.println(name + ", huh? Well, let's get started.");

	Hand.fillHand();
	
	
	kb.close();
	}

}
/*  Greeting / name
 * 	Game prompts (stay, hold)
 * 
 * */

