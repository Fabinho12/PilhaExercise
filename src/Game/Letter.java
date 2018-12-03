package Game;

public class Letter {

	private String face;
	private int value;
	private String naipe;

	public Letter(String face, int value, String naipe) {
		this.face = face;
		this.value = value;
		this.naipe = naipe;
	}

	public String getFace() {
		return face;
	}

	public void setFace(String face) {
		this.face = face;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public String getNaipe() {
		return naipe;
	}

	public void setNaipe(String naipe) {
		this.naipe = naipe;
	}

	public String toString() {
		return face + " de " + naipe;
	}
}
