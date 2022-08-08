package Game;

import java.util.LinkedList;
import java.util.List;

public class Deck {
	List<Card> cards = new LinkedList<>();
private List<String> value = List.of("2", "3", "4", "5", "6", "7", "8", "9",
		"10", "Jack", "Queen", "King", "Ace");
private List<String> suits = List.of("Hearts", "Spades", "Clubs", "Diamonds");

public Deck() {
	for (int index= 0; index < value.size(); index++) {
		String cardName = value.get(index);
		int rank= index + 1;
		
		for (String suit : suits) {
			cards.add(new Card(cardName, suit, rank));
		}
	}
	
}

@Override
public String toString() {
	StringBuilder b = new StringBuilder();
	
	b.append("\nCards in deck:\n");
	for (Card card : cards) {
		b.append("   ").append(card).append("\n");
	}
	return b.toString();
	
}

public List<?> getCards() {
	// TODO Auto-generated method stub
	return cards;
}

public int size() {
	// TODO Auto-generated method stub
	return cards.size();
}

public Card draw() {
	// TODO Auto-generated method stub
	return cards.remove(0);
	
}


}

