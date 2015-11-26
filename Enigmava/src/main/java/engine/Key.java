package engine;

import java.util.ArrayList;

public class Key {
	
	private ArrayList<Rotor> sequenceRotor;
	
	private ArrayList<Integer> sequenceInit;
	
	public Key(Rotor rotor1, Rotor rotor2, Rotor rotor3){
		super();
		this.sequenceRotor = new ArrayList<Rotor>();
		this.sequenceInit = new ArrayList<Integer>();
		sequenceRotor.add(0, rotor1);
		sequenceRotor.add(1, rotor2);
		sequenceRotor.add(2, rotor3);
		for (int i=0;i<3;i++){
			sequenceInit.add(0);
		}
	}
	
	public Key getKey(){
		return this;
	}
	
	public ArrayList<Rotor> getSequenceRotor(){
		return this.sequenceRotor;
	}
	
	public ArrayList<Integer> getSequenceInit(){
		return this.sequenceInit;
	}
	
	public void setSequenceRotor(int index, Rotor rotor){
		if (index <= 3 && index >= 1){
			this.sequenceRotor.set(index, rotor);
		}
	}
	
	public void setSequenceInit(int index, int init){
		if (index <= 3 && index >= 1){
			this.sequenceInit.set(index, init);
		}
	}
}
