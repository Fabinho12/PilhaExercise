package Execution;

import Game.Deck;

public class Main {

	public static void main(String[] args) {
		Deck deck = new Deck();
		
		deck.display();
		deck.shuffle();
		deck.display();
		deck.shuffle();
		
		System.out.print("Enter the number of cards to face: ");
		
	}

}
