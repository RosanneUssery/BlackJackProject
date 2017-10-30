package com.skilldistillery.cards.blackjack;

import java.util.List;
import java.util.Scanner;

public class Table {
	private Player player;
	private Dealer dealer;
	private int playerScore1;
	private int playerScore;
	private int dealerScore1;
	private int dealerScore;
	Scanner kb = new Scanner(System.in);

	public Table(Player player, Dealer dealer) {
		this.player = player;
		this.dealer = dealer;
	}

	public void dealInitialCards() {
		Card playerCard = dealer.dealACard();
		player.takeCards(playerCard);
		playerScore1 = playerCard.getRank().value;
		playerCard = dealer.dealACard();
		player.takeCards(playerCard);
		playerScore = playerCard.getRank().value;
		playerScore = playerScore1 + playerScore;

		Card dealerCard = dealer.dealACard();
		dealer.takeCards(dealerCard);
		dealerScore1 = dealerCard.getRank().value;
		dealerCard = dealer.dealACard();
		dealer.takeCards(dealerCard);
		dealerScore = dealerCard.getRank().value;
		dealerScore = dealerScore1 + dealerScore;
	}

	public void revealCards() {
		List<Card> handCards = player.getHeldCards();
		System.out.println("Your hand is " + handCards + " " + playerScore);

	}

	public void revealDealerCard() {
		List<Card> oneCard = dealer.getHeldCards();
		System.out.println("Dealer shows " + oneCard.get(0) + " " + dealerScore1);
	}

	public void startGamePlay() {
		dealInitialCards();
		revealCards();
		revealDealerCard();
	}

	// player hit or stand
	public void gamePlay() {
		int option = 0;
		do {
			System.out.println("Would you like to hit (1) or stand (2)?");
			option = kb.nextInt();
			if (option == 1) {
				Card playerCard = dealer.dealACard();
				player.takeCards(playerCard);
				List<Card> handCards = player.getHeldCards();
				playerScore = playerCard.getRank().value + playerScore;
				System.out.println(handCards + " " + playerScore);
			} else {
				System.out.println("You stand");
			}

			// keep asking player if they want to hit or stand
			// until they hit/bust or decide to stand

		} while (option == 1);
	}

	public void dealerPlay() {
		do {
			if (dealerScore < 17) {
				Card dealerCard = dealer.dealACard();
				dealer.takeCards(dealerCard);
				// List<Card> oneCard = dealer.getHeldCards();
				dealerScore = dealerCard.getRank().value + dealerScore;
			} else if (dealerScore > 21) {
				System.out.println("Dealer busts!");
			} else if (dealerScore >= 17 && dealerScore < 21) {
				System.out.println("Dealer stands.");
			}
		} while (dealerScore < 17);

	}

	public void checkWin() {
		List<Card> handCards = player.getHeldCards();
		System.out.println(handCards + " " + playerScore);
		List<Card> oneCard = dealer.getHeldCards();
		System.out.println(oneCard + " " + dealerScore);
		if (playerScore == 21 || dealerScore > 21) {
			System.out.println("You win!");
		} else if (playerScore > 21) {
			System.out.println("You bust!");
		} else {
			if (playerScore < 21 && playerScore > dealerScore) {
				System.out.println("You lose");
			} else if (playerScore == dealerScore) {
				System.out.println("You draw");
			} else {
				System.out.println("You win!");
			}
		}
	}
}
/*
 * Game prompt logic (stay, hold if statements)
 */
