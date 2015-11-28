package engine;

import java.util.ArrayList;

public class Rotor {

	private ArrayList<Integer> upperLane;
	
	private ArrayList<Integer> lowerLane;
	
	public Rotor() {
		super();
		this.upperLane = new ArrayList<Integer>();
		this.lowerLane = new ArrayList<Integer>();
		for (int i=0;i<26;i++){
			this.upperLane.add(i, i);
			this.lowerLane.add(i, i*10);
		}
	}
	
	public Rotor getRotor(){
		return this;
	}
	
	public ArrayList<Integer> getUpperLane(){
		return this.upperLane;
	}
	
	public ArrayList<Integer> getLowerLane(){
		return this.lowerLane;
	}
	
	public int getUpperLaneValue(int index){
		return (this.upperLane.get(index));
	}
	
	public int getLowerLaneValue(int index){
		return (this.lowerLane.get(index));
	}
	
	public void setUpperLane(int index, int value){
		this.upperLane.set(index, value);
	}
	
	public void setLowerLane(int index, int value){
		this.lowerLane.set(index, value);
	}
	
	public void moveLeft(){
		int upperNum = this.getUpperLaneValue(0);
		for (int i=0;i<25;i++){
			int old = this.getUpperLaneValue(i+1);
			this.setUpperLane(i, old);
		}
		this.setUpperLane(25, upperNum);
		
		int lowerNum = this.getLowerLaneValue(0);
		for (int i=0;i<25;i++){
			int old = this.getLowerLaneValue(i+1);
			this.setLowerLane(i, old);
		}
		this.setLowerLane(25, lowerNum);
	}
	
	public void moveRight(){
		int upperNum = this.getUpperLaneValue(25);
		for (int i=25;i>0;i--){
			int old = this.getUpperLaneValue(i-1);
			this.setUpperLane(i, old);
		}
		this.setUpperLane(0, upperNum);
		
		int lowerNum = this.getLowerLaneValue(25);
		for (int i=25;i>0;i--){
			int old = this.getLowerLaneValue(i-1);
			this.setLowerLane(i, old);
		}
		this.setLowerLane(0, lowerNum);
		
	}
}
