package com.skilldistillery.cards.blackjack;

import java.util.Scanner;

public class Table {
	Deck deck = new Deck();

	// play again loop
	public static int contGamePlay(int score) {
		Scanner kb = new Scanner(System.in);
		do {
			if (score > 21) {
				// System.out.println("You lose! Dealer laughs and takes all your money.");
				Player.lose = true;
				break;
			}
			if (score == 21) {
				// System.out.println("You win!");
				Player.win = true;
				break;
			} else {
				String choice;
				do {
					System.out.println("Would you like to hit or stand? (H/S)");
					choice = kb.nextLine();
					if (choice.equals("H")) {
						score = Hand.hitMe(score);
						if (score < 21) {
							System.out.println("Your score is: " + score);
							continue;
						} else if (score == 21) {
							// System.out.println("You win!");
							Player.win = true;
							break;
						} else if (score > 21) {
							Player.lose = true;
							break;
						}

					} else if (choice.equals("S")) {
						Player.stand();
						break;
					}
				} while (!choice.equals("S"));
			}
		} while (score >= 21);
		// System.out.println("Keep going!");
		return score;

	}

	public static int dealerPlay(int dealerScore) {
		do {

			if (dealerScore == 21) {
				Player.win = false;
				// System.out.println("Dealer wins!");

			} else if (dealerScore > 21) {
				// System.out.println("Dealer busts!");
			} else {
				do {
					if (dealerScore >= 17) {
						Dealer.stand();
						// break;
					} else if (dealerScore < 17) {
						int newDS = 0;
						System.out.println("Dealer draws:");
						newDS = dealerScore + Hand.dealerHitMe(newDS);
						System.out.println("Their score is: " + newDS);
						if (newDS > 21) {
							Player.win = true;
							// System.out.println("Dealer busts.");
						} else if (newDS == 21) {
							Player.lose = true;
							// System.out.println("Dealer wins!");
						}
					}
				} while (dealerScore >= 21);
			}
		} while (Player.lose = false);
		return dealerScore;
	}

	public static void winDetermine() {

		if (Player.win = true && Player.lose == false) {
			System.out.println("You win!");
		} else if (Player.lose = true && Player.win == false) {
			System.out.println("You lose!");
		} else if (Player.stand() && Dealer.stand()) {
			System.out.println("It's a draw!");
		}
	}
}
/*
 * Game prompt logic (stay, hold if statements)
 */
