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

}
