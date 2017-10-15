package com.skilldistillery.cards.blackjack;

public class Hand {

	public static int fillHand() {
		// need to create a method here to deal cards to each player
		// and then tally the values of each card
		// each player gets two cards
		Deck d = new Deck();
		d.shuffle();
		Card playerCard = null;
		int x = 0;
		int score = 0;
		for (int i = 0; i < 1; i++) {
			for (int j = 0; j < 2; j++) {
				playerCard = d.dealCard();
				x = playerCard.getRank().getValue();
				System.out.println(playerCard);
				score = score + x;
			}
			// figure out how to get the score values out of the hand
		}
		//System.out.println("Your score is " + score);
		return score;
	}

	public static int hitMe(int score) {
		Deck d = new Deck();
		d.shuffle();
		Card playerCard = null;
		int x = 0;
		playerCard = d.dealCard();
		x = playerCard.getRank().getValue();
		System.out.println(playerCard);
		score = score + x;
		return score;
		

	}
	
}
/*
 * Card mechanics, hit/stay
 */
