package com.skilldistillery.cards.blackjack;

import java.util.ArrayList;
import java.util.List;

public class Player {
	//needs to take cards and put them in their hand
	
	private List<Card> heldCards = new ArrayList<>(); 
	
	public void takeCards(Card newCard) {
		heldCards.add(newCard);
		//is called by player eventually
	}
	
	public List<Card> getHeldCards() {
		return heldCards;
	}
	
}
