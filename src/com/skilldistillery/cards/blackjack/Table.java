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
			} else if (dealerScore == 17 && dealerScore < 21){
				System.out.println("Dealer stands.");
			} else {
				System.out.println("Dealer wins!");
			}
		} while (dealerScore < 17);

	}

	public void checkWin() {
		List<Card> handCards = player.getHeldCards();
		System.out.println(handCards + " " + playerScore);
		List<Card> oneCard = dealer.getHeldCards();
		System.out.println(oneCard + " " + dealerScore);
		if (playerScore == 21) {
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
	/*
	 * public int startGamePlayer() {
	 * 
	 * int dealerScore = 0; System.out.println("Dealer deals itself:");
	 * 
	 * 
	 * 
	 * System.out.println("Their score is " + dealerScore); if (dealerScore == 21) {
	 * } return dealerScore; // String choice = null;
	 * 
	 * }
	 * 
	 * public boolean stand() { boolean dStand = true;
	 * System.out.println("Dealer stands."); return dStand; }
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * // needs to look at the cards and state the score // needs to allow user to
	 * say whether to hit or stay-- goes to table // // play again loop public
	 * static int contGamePlay(int score) { Scanner kb = new Scanner(System.in); do
	 * { if (score > 21) { Player.win = false; break; } if (score == 21) {
	 * Player.win = true; break; } else { String choice; do {
	 * System.out.println("Would you like to hit or stand? (H/S)"); choice =
	 * kb.nextLine(); if (choice.equals("H")) { score = Hand.hitMe(score);
	 * System.out.println("Your score is: " + score); if (score < 21) { continue; }
	 * else if (score == 21) { // System.out.println("You win!"); Player.win = true;
	 * break; } else if (score > 21) { Player.win = false; break; }
	 * 
	 * } else if (choice.equals("S")) { Player.stand(); break; } } while
	 * (!choice.equals("S") || score >= 21); } } while (!Player.stand() || score >=
	 * 21); // System.out.println("Keep going!"); return score;
	 * 
	 * }
	 * 
	 * public static int dealerPlay(int dealerScore) { do {
	 * 
	 * if (dealerScore == 21) { Player.win = false; //
	 * System.out.println("Dealer wins!");
	 * 
	 * } else if (dealerScore > 21) { // System.out.println("Dealer busts!"); } else
	 * { int newDS = 0; do { if (dealerScore >= 17) { Dealer.stand(); // break; }
	 * else if (dealerScore < 17) { System.out.println("Dealer draws:"); newDS =
	 * dealerScore + Hand.dealerHitMe(newDS); System.out.println("Their score is: "
	 * + newDS); if (newDS > 21) { Player.win = true; //
	 * System.out.println("Dealer busts."); } else if (newDS == 21) { Player.win =
	 * false; // System.out.println("Dealer wins!"); } } } while (newDS >= 21); } }
	 * while (Player.win = false); return dealerScore; }
	 * 
	 * public static void winDetermine() { int score = 0; int dealerScore = 0; score
	 * = contGamePlay(score); dealerScore = dealerPlay(dealerScore); Boolean pStands
	 * = Player.stand(); Boolean dStands = Dealer.stand(); if (pStands == true &&
	 * dStands == true && dealerScore < 21 && score < 21) {
	 * System.out.println("It's a draw!"); } else if (Player.win = true && score ==
	 * 21) { System.out.println("You win!"); } else if (Dealer.dWin == true) {
	 * System.out.println("You lose!"); } else if (Player.win == false && score >
	 * 21) { System.out.println("You lose!"); } }
	 */}
/*
 * Game prompt logic (stay, hold if statements)
 */
