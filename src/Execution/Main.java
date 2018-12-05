package Execution;

import java.util.Scanner;

import Game.Deck;

public class Main {

	public static void main(String[] args) {
		Deck deck = new Deck();
		Scanner number = new Scanner(System.in);

		deck.display();
		deck.shuffle();

		System.out.print("Enter a number between 3 and 8: ");

		int value = number.nextInt();

		if (value < 3 || value > 8) {
			System.out.println("Invalid! Enter a number between 3 and 8: ");
		}

		String letter;
		String name = "";

		for (int i = 0; i < value; i++) {
			letter = deck.turnTheLetter().toString();

			if (letter.contains("Paus") || letter.contains("Espadas")) {
				System.out.println("Black");
				if (name == "Black") {
					System.out.println("You Lose!");
					break;
				}
				name = "Black";
			} else if (letter.contains("Copas") || letter.contains("Ouro")) {
				System.out.println("Red");
				if (name == "Red") {
					System.out.println("You Lose!");
					break;
				}
				name = "Red";
			}

		}

		System.out.println("Congratulatios!");

		number.close();

	}

}
