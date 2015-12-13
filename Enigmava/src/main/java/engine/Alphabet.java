package engine;

import java.util.ArrayList;

public class Alphabet {

	private ArrayList<Character> alphaList;

	public Alphabet() {
		this.alphaList = new ArrayList<Character>();
		int initAlph = 97;
		for (int i = 0; i < 26; i++) {
			int ascii = initAlph + i;
			this.alphaList.add(i, (char) (ascii));
		}

	}

	public ArrayList<Character> getAlphaList() {
		return this.alphaList;
	}

	public char getLetter(int index) {
		return this.alphaList.get(index);

	}

	public Alphabet getAlphabet() {
		return this;
	}
}