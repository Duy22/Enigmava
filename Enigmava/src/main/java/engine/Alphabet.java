package engine;

import java.util.ArrayList;

public class Alphabet {
private ArrayList<String> alphaList;  
	
	public Alphabet(){
		this.alphaList = new ArrayList<String>();
			this.alphaList.add(0,"a");
			this.alphaList.add(1,"b");
			this.alphaList.add(2,"c");
			this.alphaList.add(3,"d");
			this.alphaList.add(4,"e");
			this.alphaList.add(5,"f");
			this.alphaList.add(6,"g");
			this.alphaList.add(7,"h");
			this.alphaList.add(8,"i");
			this.alphaList.add(9,"j");
			this.alphaList.add(10,"k");
			this.alphaList.add(11,"l");
			this.alphaList.add(12,"m");
			this.alphaList.add(13,"n");
			this.alphaList.add(14,"o");
			this.alphaList.add(15,"p");
			this.alphaList.add(16,"q");
			this.alphaList.add(17,"r");
			this.alphaList.add(18,"s");
			this.alphaList.add(19,"t");
			this.alphaList.add(20,"u");
			this.alphaList.add(21,"v");
			this.alphaList.add(22,"w");
			this.alphaList.add(23,"x");
			this.alphaList.add(24,"y");
			this.alphaList.add(25,"z");
			
		
	}
	public ArrayList<String> getAlphaList(){
		return this.alphaList;
	}
	
	public String getLetter(int index){
		return this.alphaList.get(index);
	}
	public void setLetter(int index, String value){
		this.alphaList.set(index, value);
	}
	public Alphabet getAlphabet(){
		return this;
	}


}
