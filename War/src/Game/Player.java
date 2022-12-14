package Game;

import java.util.LinkedList;
import java.util.List;

public class Player {

		private String name;
		private List<Card> hand = new LinkedList<>();
		private int score;
		public int getScore() {
			return score;
		}
		public Player (String name) {
			this.name = name;
		}
		public String getName() {
			return name;
		}
	
		
		public void draw(Deck deck) {
			hand.add(deck.draw());
			
		}
		@Override
		public String toString() {
			return "Player [name=" + name + ", hand=" + hand + ", score=" + score + "]";
		}
		public int size() {
			return hand.size();
		}
		public Card flip() {
			// TODO Auto-generated method stub
			return hand.remove(0);
		}
		public void incrementScore() {
			// TODO Auto-generated method stub
			score += 1;
		}
	}



