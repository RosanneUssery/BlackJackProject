package com.skilldistillery.cards.blackjack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

	static List<Card> deck = new ArrayList<>(52);

	public static void listCards() {
		for (Suit s : Suit.values()) {
			for (Rank r : Rank.values()) {
				deck.add(new Card(r, s));
			}
		}
		System.out.println("___Ordered Cards___");
		Collections.sort(deck);
		for (Card card : deck) {
			System.out.println(card);
		}
		System.out.println("___Shuffled Cards___");
		Collections.shuffle(deck);
		for (Card card : deck) {
			System.out.println(card);
		}

	}

	public static Card dealCard() { //takes one card from the deck and displays it.
		for (Suit s : Suit.values()) {
			for (Rank r : Rank.values()) {
				deck.remove(new Card(r, s));
			}
		}
		System.out.println(deck.remove(1));
		return deck.remove(0);
		
	}

}
