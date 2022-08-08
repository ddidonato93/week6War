package Game;

import java.util.List;
import java.util.Random;

public class Card {
	private String suit;
	private String cardName;
	private int rank;
	
	public Card(String cardName, String suit, int rank) {
		this.cardName = cardName;
		this.suit = suit;
		this.rank = rank;
		
	}

	@Override
	public String toString() {
	return getCardType() + " , rank=" + rank;
	
	}

	private String getCardType() {
		// TODO Auto-generated method stub
		return cardName + " of " + suit;
	}

	public int getRank() {
		// TODO Auto-generated method stub
		return rank;
	}




}