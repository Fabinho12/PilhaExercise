package Battery;

public class BatteryObj {

	private Object[] pilha;
	private int topo;

	public BatteryObj(int tam) {
		pilha = new Object[tam];
		topo = -1;
	}

	public boolean isEmpty() {
		return (topo == -1);
	}

	public boolean isFull() {
		return (topo == pilha.length - 1);
	}

	public void push(Object obj) {
		if (isFull()) {
			System.out.println("Pilha esta cheia!");
		} else {
			pilha[++topo] = obj;
		}
	}

	public Object pop() {
		Object retorno;
		if (isEmpty()) {
			System.out.println("Pilha esta vazia");
			return -1;
		}
		retorno = pilha[topo];
		topo--;
		return retorno;
	}

	public void exibePilhaBaseParaTopo() {
		System.out.println("\nExibindo pilha da base para o topo");
		for (int i = 0; i <= topo; i++) {
			System.out.println(pilha[i]);
		}
	}

	public void exibePilhaTopoParaBase() {
		System.out.println("\nExibindo pilha do topo para a base");
		for (int i = topo; i >= 0; i--) {
			System.out.println(pilha[i]);
		}
	}

}
