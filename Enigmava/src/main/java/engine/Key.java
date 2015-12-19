package engine;

import java.util.ArrayList;

public class Key {

	private ArrayList<Rotor> sequenceRotor;

	private ArrayList<Integer> sequenceInit;

	private ArrayList<Boolean> sequenceOrientation;

	public Key(Rotor rotor1, Rotor rotor2, Rotor rotor3) {
		super();
		this.sequenceRotor = new ArrayList<Rotor>();
		this.sequenceInit = new ArrayList<Integer>();
		this.sequenceOrientation = new ArrayList<Boolean>();
		this.sequenceRotor.add(0, rotor1);
		this.sequenceRotor.add(1, rotor2);
		this.sequenceRotor.add(2, rotor3);
		for (int i = 0; i < 3; i++) {
			this.sequenceInit.add(i);
		}
		for (int i = 0; i < 3; i++) {
			this.sequenceOrientation.add(i, true);
		}
	}

	public Key getKey() {
		return this;
	}

	public ArrayList<Boolean> getSequenceOrientation() {
		return this.sequenceOrientation;
	}

	public ArrayList<Rotor> getSequenceRotor() {
		return this.sequenceRotor;
	}

	public ArrayList<Integer> getSequenceInit() {
		return this.sequenceInit;
	}

	public void setSequenceOrientation(int index, boolean bool) {
		this.sequenceOrientation.set(index, bool);
	}

	public void setSequenceRotor(int index, Rotor rotor) {
		if (index < 3 && index >= 0) {
			this.sequenceRotor.set(index, rotor);
		}
	}

	public void setSequenceInit(int index, Integer init) {
		if (index < 3 && index >= 0) {
			this.sequenceInit.set(index, init);
		}
	}
}