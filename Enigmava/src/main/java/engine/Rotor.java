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
		int upperNum = this.getUpperLane(0);
		for (int i=0;i<25;i++){
			this.setUpperLane(i, this.getUpperLane(i+1));
			this.setUpperLane(25, upperNum);
		}
		
		int lowerNum = this.getLowerLane(0);
		for (int i=0;i<25;i++){
			this.setLowerLane(i, this.getLowerLane(i+1));
			this.setLowerLane(25, lowerNum);
		}
	}
	
	public void moveRight(){
		int upperNum = this.getUpperLane(25);
		for (int i=25;i<0;i--){
			this.setUpperLane(i, i-1);
			this.setUpperLane(0, upperNum);
		}
		
		int lowerNum = this.getLowerLane(25);
		for (int i=25;i<0;i--){
			this.setLowerLane(i, i-1);
			this.setLowerLane(0, upperNum);
		}
		
	}
}
