package com.skilldistillery.cards.blackjack;

public enum Suit {
	HEARTS('\u2660'), 
	SPADES('\u2660'), 
	CLUBS('\u2660'), 
	DIAMONDS('\u2660'); 
	
	  public final char pic;

	    Suit(char pic) {
	        this.pic = pic;
	    }

	    public int getPic() {
	        return pic;
	    }
	    
	    //suit.ordinal()
	
}
