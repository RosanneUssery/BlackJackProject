package com.skilldistillery.cards.blackjack;


public class Dealer extends Player {

	public Dealer(Deck deck) {
		this.deck = deck;
		deck.shuffle();
	}

	public Dealer() {
		deck = new Deck();
		deck.shuffle();
	}

	private Deck deck;

	public Card dealACard() {
		Card card = deck.dealCard();
		return card;
	}
	
	
	
	
	
	
	

	/*public int startGamePlayDealer() {

		int dealerScore = 0;
		System.out.println("Dealer deals itself:");
		dealerScore = Hand.fillHand();
		System.out.println("Their score is " + dealerScore);
		if (dealerScore == 21) {
			dWin = true;
		}
		return dealerScore;
		// String choice = null;

	}

	public boolean stand() {
		boolean dStand = true;
		System.out.println("Dealer stands.");
		return dStand;
	}*/

}
