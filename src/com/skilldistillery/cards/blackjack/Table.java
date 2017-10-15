package com.skilldistillery.cards.blackjack;

import java.util.Scanner;

public class Table {
	Deck deck = new Deck();
	// play again loop
	public static int contGamePlay(int score) {
		Scanner kb = new Scanner(System.in);
		do {
			if (score > 21) {
				System.out.println("You lose! Dealer laughs and takes all your money.");
				break;
			}
			if (score == 21) {
				System.out.println("You win!");
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
							System.out.println("You win!");
							break;
						} else if (score > 21) {
							System.out.println("You bust! Dealer takes all your money");
							break;
						}

					} else if (choice.equals("S")){
						Player.stand();
						break;
					}
				} while (!choice.equals("S") );
			}
		} while (score >= 21);
		//System.out.println("Keep going!");
		return score;

	}
	public static int dealerPlay(int dealerScore) {

		if (dealerScore == 21) {
			System.out.println("Dealer wins!");
		}
		else if (dealerScore > 21) {
			System.out.println("Dealer busts!");
		}
		else {
			do {
			if (dealerScore >= 17) {
				Dealer.stand();
				break;
			}
			else if (dealerScore < 17) {
				int newDS = 0;
				newDS = dealerScore + Hand.hitMe(newDS);
				System.out.println("Their score is: " + newDS);
			}
			}while(dealerScore >= 21);
		}
		
		return dealerScore;
	}
}
/*
 * Game prompt logic (stay, hold if statements)
 */
