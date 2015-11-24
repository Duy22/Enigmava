package engine;

import java.util.ArrayList;

public class Rotor {

	private ArrayList<Integer> upperLane;
	private ArrayList<Integer> lowerLane;
	private int currentPosition;
	
	public Rotor() {
		super();
		for (int i=0;i>26;i++){
			this.upperLane.add(i, i);
			this.lowerLane.add(i, i*10);
		}
		this.currentPosition = 0;
	}
	
	public Rotor getRotor(){
		return this;
	}
	
	public int getUpperLane(int index){
		return (this.upperLane.get(index));
	}
	
	public int getLowerLane(int index){
		return (this.lowerLane.get(index));
	}
	
	public int getCurrentPosition(){
		return this.currentPosition;
	}
	
	public void setUpperLane(int index, int value){
		this.upperLane.set(index, value);
	}
	
	public void setLowerLane(int index, int value){
		this.lowerLane.set(index, value);
	}
	
	public void setCurrentPosition(int value){
		this.currentPosition = value;
	}
	
	public void moveLeft(){
		
	}
	
	public void moveRight(){
		
	}
}
