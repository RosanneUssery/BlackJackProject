package com.skilldistillery.cards.blackjack;

public class Table {
	Deck deck = new Deck();
	
	public  void drawCard() {
		deck.shuffle();
		Card c = deck.dealCard();
		System.out.println(c);
	}

}
/*
 * Game prompt logic (stay, hold if statements)
 */
