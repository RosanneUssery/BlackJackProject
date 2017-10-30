package com.skilldistillery.cards.blackjack;

import java.util.ArrayList;
import java.util.List;

public class Player {
	//Hand.takeCards();
	//needs to take cards and put them in their hand
	
	private List<Card> heldCards = new ArrayList<>(); 
	
	public void takeCards(Card newCard) {
		heldCards.add(newCard);
		//is called by player eventually
	}
	
	public List<Card> getHeldCards() {
		return heldCards;
	}

	
	
	
	
	/*
	
	public int startGamePlay() {
		int score = 0;

		System.out.println("You are dealt:");
		score = Hand.fillHand();
		System.out.println("Your score is " + score);
		if (score == 21) {
			win = true;
		}

		return score;
	}

	public boolean stand() {
		boolean pStand = true;
		System.out.println("You stand.");
		return pStand;

	}

	public boolean wins() {
		win = true;
		return win;

	}

*/}
