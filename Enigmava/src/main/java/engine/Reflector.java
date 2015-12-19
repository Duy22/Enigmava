package engine;

import java.util.ArrayList;

public class Reflector {

	private ArrayList<Integer> numList;

	public Reflector() {
		this.numList = new ArrayList<Integer>();
		for (int i = 0; i < 26; i++) {
			this.numList.add(i, i);
		}
	}

	public ArrayList<Integer> getNumList() {
		return this.numList;
	}

	public int getNum(int index) {
		return this.numList.get(index);
	}

	public void setNum(int index, int value) {
		this.numList.set(index, value);
	}

	public Reflector getReflector() {
		return this;
	}
}