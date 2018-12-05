package Game;

import java.util.Random;

import Battery.BatteryObj;

public class Deck {

	private BatteryObj deck;

	public Deck() {
		String faces[] = { "Ás", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };
		String naipe[] = { "Copas", "Paus", "Ouro", "Espadas" };

		deck = new BatteryObj(52);

		int cont = 0;
		
		while (!deck.isFull()) {
			deck.push(new Letter(faces[cont % 13], cont % 13 + 1, naipe[cont / 13]));
			cont++;
		}
	}

	public BatteryObj getDeck() {
		return deck;
	}

	public void setDeck(BatteryObj deck) {
		this.deck = deck;
	}

	public Object removeLetter(int ind) {
		BatteryObj aux = new BatteryObj(ind);

		for (int i = 0; i < ind; i++) {
			aux.push(deck.pop());
		}

		Object alvo = deck.pop();

		while (!aux.isEmpty()) {
			deck.push(aux.pop());
		}
		deck.push(alvo);
		return alvo;
	}

	public void shuffle() {

		Random numAleatorio = new Random();
		int aux = 0;

		while (aux < 52) {
			int indice = numAleatorio.nextInt(52);

			if (indice != 0) {
				removeLetter(indice);
			}
			aux++;
		}
	}

	public Letter turnTheLetter() {
		Object letter = deck.pop();
		return (Letter) letter;
	}

	public void display() {
		deck.exibePilhaTopoParaBase();
	}

}
