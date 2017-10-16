package com.skilldistillery.cards.blackjack;

import java.util.Scanner;

public class Table {
	Deck deck = new Deck();

	// play again loop
	public static int contGamePlay(int score) {
		Scanner kb = new Scanner(System.in);
		do {
			if (score > 21) {
				Player.win = false;
				break;
			}
			if (score == 21) {
				Player.win = true;
				break;
			} else {
				String choice;
				do {
					System.out.println("Would you like to hit or stand? (H/S)");
					choice = kb.nextLine();
					if (choice.equals("H")) {
						score = Hand.hitMe(score);
						System.out.println("Your score is: " + score);
						if (score < 21) {
							continue;
						} else if (score == 21) {
							// System.out.println("You win!");
							Player.win = true;
							break;
						} else if (score > 21) {
							Player.win = false;
							break;
						}

					} else if (choice.equals("S")) {
						Player.stand();
						break;
					}
				} while (!choice.equals("S") && score < 21);
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
				int newDS = 0;
				do {
					if (dealerScore >= 17) {
						Dealer.stand();
						// break;
					} else if (dealerScore < 17) {
						System.out.println("Dealer draws:");
						newDS = dealerScore + Hand.dealerHitMe(newDS);
						System.out.println("Their score is: " + newDS);
						if (newDS > 21) {
							Player.win = true;
							// System.out.println("Dealer busts.");
						} else if (newDS == 21) {
							Player.win = false;
							// System.out.println("Dealer wins!");
						}
					}
				} while (newDS >= 21);
			}
		} while (Player.win = false);
		return dealerScore;
	}

	public static void winDetermine() {
		int score = 0;
		int dealerScore = 0;
		score = contGamePlay(score);
		dealerScore = dealerPlay(dealerScore);
		Boolean pStands = Player.stand();
		Boolean dStands = Dealer.stand();
		if (pStands == true && dStands == true && dealerScore < 21 && score < 21) {
			System.out.println("It's a draw!");
		} else if (Player.win = true && score == 21) {
			System.out.println("You win!");
		} else if (Dealer.dWin == true) {
			System.out.println("You lose!");
		}
		else if (Player.win == false && score > 21) {
			System.out.println("You lose!");
		}
	}
}
/*
 * Game prompt logic (stay, hold if statements)
 */
