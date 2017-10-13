package com.skilldistillery.cards.blackjack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Deck {

	static List<Card> deck = new ArrayList<>(52);

	public Deck() {
		for (Suit s : Suit.values()) {
			for (Rank r : Rank.values()) {
				deck.add(new Card(r, s));
			}
		}
	}

	public Card dealCard() { // takes one card from the deck and displays it.
		return deck.remove(0);

	}

	public void shuffle() {
		Collections.shuffle(deck);

	}

}
