package Game;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class App {
	List<String> names = List.of("Player 1", "Player 2");
	
	Random random = new Random();

	public static void main(String[] args) {
		new App().playWar();
	
		
	}

	private void playWar() {
		List<String> playerNames = new LinkedList<>(names);
		Player player1 = findPlayer(playerNames);
		Player player2 = findPlayer(playerNames);
		
		
		Deck deck = new Deck();
		shuffleDeck(deck);
		dealTheCards(player1, player2, deck);
		
		playTheGame(player1, player2);
		determineWinner(player1, player2);
		
		
		
	}
	private void determineWinner(Player player1, Player player2) {
		Player winner = null;
		Player loser = null;
		
		if (player1.getScore() > player2.getScore()) {
		winner = player1;
		loser = player2;
		} else if ( player2.getScore() > player1.getScore()) {
			winner = player2;
			loser = player1;
		}
			if (winner == null) {
				System.out.println("Draw");
			}
			else {
				System.out.println("Winner is" + " " + winner.getName() + " with a score of" + " " + winner.getScore() );
			}
	}
	
		
	private void playTheGame(Player player1, Player player2) {
		int deckSize = player1.size() + player2.size();
		for (int playNum = 0; playNum < deckSize / 2; playNum++) {
			Card card1 = player1.flip();
			Card card2 = player2.flip();
			if(card1.getRank()  > card2.getRank()) {
				player1.incrementScore();
			}
			else if (card2.getRank() > card1.getRank()) {
				player2.incrementScore();
				
			}
		}
	}

	private void dealTheCards(Player player1, Player player2, Deck deck) {
		int deckSize = deck.size();
		
		for(int pos = 0; pos < deckSize; pos++ ) {
			if (pos % 2 == 0) {
				player1.draw(deck);
				
			}
			else {
				player2.draw(deck);
			}
		}		
	}

			
	
	private void shuffleDeck(Deck deck) {
		Collections.shuffle(deck.getCards());
	}

	private Player findPlayer(List<String> names) {
		
		int pos = random.nextInt(names.size());
		String name = names.remove(pos);
		return new Player(name);
		
	}

}
