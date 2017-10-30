package com.skilldistillery.cards.blackjack;

public enum Suit {
	HEARTS('\u2661'), 
	SPADES('\u2664'), 
	CLUBS('\u2667'), 
	DIAMONDS('\u2662'); 
	
	  public final char pic;

	    Suit(char pic) {
	        this.pic = pic;
	    }

	    public int getPic() {
	        return pic;
	    }
	    
	
}
