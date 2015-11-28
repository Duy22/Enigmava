package engine;

import java.text.Normalizer;
import java.util.ArrayList;

public class CryptAlgo {

	private Key key;

	private String input;

	private Reflector reflector;

	private ArrayList<Rotor> rotorList;
	
	private Alphabet alphabet;
	
	public CryptAlgo(Key k, ArrayList<Rotor> rL, Reflector ref, Alphabet alpha){
		super();
		this.key = k;
		this.input = "";
		this.reflector = ref;
		this.rotorList = rL;
		this.alphabet = alpha;
	}
	
	public void setKey(Key k){
		this.key = k;
	}
	
	public void setReflector(Reflector r){
		this.reflector = r;
	}
	
	public void setAlphabet(Alphabet alpha){
		this.alphabet = alpha;
	}
		
	public void setInput(String s){
		this.input = s;
	}
	
	public void initReflector(){
		int decrement = 27;
		for (int i=0; i<26; i++){
			decrement = decrement -2;
			this.reflector.setNum(i, decrement);
		}
	}
	
	public void initRotor1(){
		//upper lane settings
		this.rotorList.get(0).setUpperLane(0, 17);
		this.rotorList.get(0).setUpperLane(1, 4);
		this.rotorList.get(0).setUpperLane(2, 19);
		this.rotorList.get(0).setUpperLane(3, 21);
		this.rotorList.get(0).setUpperLane(4, 7);
		this.rotorList.get(0).setUpperLane(5, 11);
		this.rotorList.get(0).setUpperLane(6, 3);
		this.rotorList.get(0).setUpperLane(7, -5);
		this.rotorList.get(0).setUpperLane(8, 7);
		this.rotorList.get(0).setUpperLane(9, 9);
		this.rotorList.get(0).setUpperLane(10, -10);
		this.rotorList.get(0).setUpperLane(11, 9);
		this.rotorList.get(0).setUpperLane(12, 17);
		this.rotorList.get(0).setUpperLane(13, 6);
		this.rotorList.get(0).setUpperLane(14, -6);
		this.rotorList.get(0).setUpperLane(15, -2);
		this.rotorList.get(0).setUpperLane(16, -4);
		this.rotorList.get(0).setUpperLane(17, -7);
		this.rotorList.get(0).setUpperLane(18, -12);
		this.rotorList.get(0).setUpperLane(19, -5);
		this.rotorList.get(0).setUpperLane(20, 3);
		this.rotorList.get(0).setUpperLane(21, 4);
		this.rotorList.get(0).setUpperLane(22, -21);
		this.rotorList.get(0).setUpperLane(23, -16);
		this.rotorList.get(0).setUpperLane(24, -2);
		this.rotorList.get(0).setUpperLane(25, -21);
		//lower lane settings
		this.rotorList.get(0).setLowerLane(0, 10);
		this.rotorList.get(0).setLowerLane(1, 21);
		this.rotorList.get(0).setLowerLane(2, 5);
		this.rotorList.get(0).setLowerLane(3, -17);
		this.rotorList.get(0).setLowerLane(4, 21);
		this.rotorList.get(0).setLowerLane(5, -4);
		this.rotorList.get(0).setLowerLane(6, 12);
		this.rotorList.get(0).setLowerLane(7, 16);
		this.rotorList.get(0).setLowerLane(8, 6);
		this.rotorList.get(0).setLowerLane(9, -3);
		this.rotorList.get(0).setLowerLane(10, 7);
		this.rotorList.get(0).setLowerLane(11, -7);
		this.rotorList.get(0).setLowerLane(12, 4);
		this.rotorList.get(0).setLowerLane(13, 2);
		this.rotorList.get(0).setLowerLane(14, 5);
		this.rotorList.get(0).setLowerLane(15, -7);
		this.rotorList.get(0).setLowerLane(16, -11);
		this.rotorList.get(0).setLowerLane(17, -17);
		this.rotorList.get(0).setLowerLane(18, -9);
		this.rotorList.get(0).setLowerLane(19, -6);
		this.rotorList.get(0).setLowerLane(20, -9);
		this.rotorList.get(0).setLowerLane(21, -19);
		this.rotorList.get(0).setLowerLane(22, 2);
		this.rotorList.get(0).setLowerLane(23, -3);
		this.rotorList.get(0).setLowerLane(24, -21);
		this.rotorList.get(0).setLowerLane(25, -4);
	}
	
	public void initRotor2(){
		//upper lane settings
		this.rotorList.get(1).setUpperLane(0, 25);
		this.rotorList.get(1).setUpperLane(1, 7);
		this.rotorList.get(1).setUpperLane(2, 17);
		this.rotorList.get(1).setUpperLane(3, -3);
		this.rotorList.get(1).setUpperLane(4, 13);
		this.rotorList.get(1).setUpperLane(5, 19);
		this.rotorList.get(1).setUpperLane(6, 12);
		this.rotorList.get(1).setUpperLane(7, 3);
		this.rotorList.get(1).setUpperLane(8, -1);
		this.rotorList.get(1).setUpperLane(9, 11);
		this.rotorList.get(1).setUpperLane(10, 5);
		this.rotorList.get(1).setUpperLane(11, -5);
		this.rotorList.get(1).setUpperLane(12, -7);
		this.rotorList.get(1).setUpperLane(13, 10);
		this.rotorList.get(1).setUpperLane(14, -2);
		this.rotorList.get(1).setUpperLane(15, 1);
		this.rotorList.get(1).setUpperLane(16, -2);
		this.rotorList.get(1).setUpperLane(17, 4);
		this.rotorList.get(1).setUpperLane(18, -17);
		this.rotorList.get(1).setUpperLane(19, -8);
		this.rotorList.get(1).setUpperLane(20, -16);
		this.rotorList.get(1).setUpperLane(21, -18);
		this.rotorList.get(1).setUpperLane(22, -9);
		this.rotorList.get(1).setUpperLane(23, -1);
		this.rotorList.get(1).setUpperLane(24, -22);
		this.rotorList.get(1).setUpperLane(25, -16);
		//lower lane settings
		this.rotorList.get(1).setLowerLane(0, 3);
		this.rotorList.get(1).setLowerLane(1, 17);
		this.rotorList.get(1).setLowerLane(2, 22);
		this.rotorList.get(1).setLowerLane(3, 18);
		this.rotorList.get(1).setLowerLane(4, 16);
		this.rotorList.get(1).setLowerLane(5, 7);
		this.rotorList.get(1).setLowerLane(6, 5);
		this.rotorList.get(1).setLowerLane(7, 1);
		this.rotorList.get(1).setLowerLane(8, -7);
		this.rotorList.get(1).setLowerLane(9, 16);
		this.rotorList.get(1).setLowerLane(10, -3);
		this.rotorList.get(1).setLowerLane(11, 8);
		this.rotorList.get(1).setLowerLane(12, 2);
		this.rotorList.get(1).setLowerLane(13, 9);
		this.rotorList.get(1).setLowerLane(14, 2);
		this.rotorList.get(1).setLowerLane(15, -5);
		this.rotorList.get(1).setLowerLane(16, -1);
		this.rotorList.get(1).setLowerLane(17, -13);
		this.rotorList.get(1).setLowerLane(18, -12);
		this.rotorList.get(1).setLowerLane(19, -17);
		this.rotorList.get(1).setLowerLane(20, -11);
		this.rotorList.get(1).setLowerLane(21, -4);
		this.rotorList.get(1).setLowerLane(22, 1);
		this.rotorList.get(1).setLowerLane(23, -10);
		this.rotorList.get(1).setLowerLane(24, -19);
		this.rotorList.get(1).setLowerLane(25, -25);
	}
	
	public void initRotor3(){
		
		//upper lane settings
		this.rotorList.get(2).setUpperLane(0, 12);
		this.rotorList.get(2).setUpperLane(1, -1);
		this.rotorList.get(2).setUpperLane(2, 23);
		this.rotorList.get(2).setUpperLane(3, 10);
		this.rotorList.get(2).setUpperLane(4, 2);
		this.rotorList.get(2).setUpperLane(5, 14);
		this.rotorList.get(2).setUpperLane(6, 5);
		this.rotorList.get(2).setUpperLane(7, -5);
		this.rotorList.get(2).setUpperLane(8, 9);
		this.rotorList.get(2).setUpperLane(9, -2);
		this.rotorList.get(2).setUpperLane(10, -13);
		this.rotorList.get(2).setUpperLane(11, 10);
		this.rotorList.get(2).setUpperLane(12, -2);
		this.rotorList.get(2).setUpperLane(13, -8);
		this.rotorList.get(2).setUpperLane(14, 10);
		this.rotorList.get(2).setUpperLane(15, -6);
		this.rotorList.get(2).setUpperLane(16, 6);
		this.rotorList.get(2).setUpperLane(17, -16);
		this.rotorList.get(2).setUpperLane(18, 2);
		this.rotorList.get(2).setUpperLane(19, -1);
		this.rotorList.get(2).setUpperLane(20, -17);
		this.rotorList.get(2).setUpperLane(21, -5);
		this.rotorList.get(2).setUpperLane(22, -14);
		this.rotorList.get(2).setUpperLane(23, -9);
		this.rotorList.get(2).setUpperLane(24, -20);
		this.rotorList.get(2).setUpperLane(25, -10);
		//lower lane settings
		this.rotorList.get(2).setLowerLane(0, 1);
		this.rotorList.get(2).setLowerLane(1, 16);
		this.rotorList.get(2).setLowerLane(2, 5);
		this.rotorList.get(2).setLowerLane(3, 17);
		this.rotorList.get(2).setLowerLane(4, 20);
		this.rotorList.get(2).setLowerLane(5, 8);
		this.rotorList.get(2).setLowerLane(6, -2);
		this.rotorList.get(2).setLowerLane(7, 2);
		this.rotorList.get(2).setLowerLane(8, 14);
		this.rotorList.get(2).setLowerLane(9, 6);
		this.rotorList.get(2).setLowerLane(10, 2);
		this.rotorList.get(2).setLowerLane(11, -5);
		this.rotorList.get(2).setLowerLane(12, -12);
		this.rotorList.get(2).setLowerLane(13, -10);
		this.rotorList.get(2).setLowerLane(14, 9);
		this.rotorList.get(2).setLowerLane(15, 10);
		this.rotorList.get(2).setLowerLane(16, 5);
		this.rotorList.get(2).setLowerLane(17, -9);
		this.rotorList.get(2).setLowerLane(18, 1);
		this.rotorList.get(2).setLowerLane(19, -14);
		this.rotorList.get(2).setLowerLane(20, -2);
		this.rotorList.get(2).setLowerLane(21, -10);
		this.rotorList.get(2).setLowerLane(22, -6);
		this.rotorList.get(2).setLowerLane(23, 13);
		this.rotorList.get(2).setLowerLane(24, -10);
		this.rotorList.get(2).setLowerLane(25, -23);
	}
	
	public String encrypt(){
		this.input = this.input.toLowerCase();
		this.input = Normalizer.normalize(this.input, Normalizer.Form.NFKD);
		char[] charList = this.input.toCharArray();
		int size = this.input.length();
		this.initRotor1();
		this.initRotor2();
		this.initRotor3();
		this.initReflector();
		double rotorNum = 0;
		int init = 0;
		Rotor rotInit;
		
		for (int i=0;i<3;i++){ // initializes the three rotors with the values of the key
			init = this.key.getSequenceInit().get(i);
			rotInit = this.key.getSequenceRotor().get(i);
			if (rotInit == this.rotorList.get(2)){
				if (init<0){
					for (int k=0;k<Math.abs(init);k++){
						this.rotorList.get(i).moveRight();
					}
				} else {
					for (int k=0;k<init;k++){
						this.rotorList.get(i).moveLeft();
					}
				}
			} else {
				if (init<0){
					for (int k=0;k<Math.abs(init);k++){
						this.rotorList.get(i).moveLeft();
					}
				} else {
					for (int k=0;k<init;k++){
						this.rotorList.get(i).moveRight();
					}
				}
			}
		}
		
		for (int i=0;i<size;i++){ // for each character of the input
			rotorNum = (Math.floor(i/25))%3;// used to determine which rotor will roll, given the key
			int rotorInt = (int)rotorNum;
			for (int j=0;j<26;j++){ // for each letter of the alphabet
				if (this.input.charAt(i)==this.alphabet.getLetter(j)){// compares the input character to the letter of the alphabet
					int k,l,m,n,o,p,q;
					k = this.rotorList.get(0).getLowerLaneValue(j); //beginning of the encryption
					l = this.rotorList.get(1).getLowerLaneValue(((j+k)%26+26)%26);
					m = this.rotorList.get(2).getLowerLaneValue(((j+k+l)%26+26)%26);
					n = this.reflector.getNum(((j+k+l+m+26)%26+26)%26);
					o = this.rotorList.get(2).getUpperLaneValue(((j+k+l+m+n)%26+26)%26);
					p = this.rotorList.get(1).getUpperLaneValue(((j+k+l+m+n+o)%26+26)%26);
					q = this.rotorList.get(0).getUpperLaneValue(((j+k+l+m+n+o+p)%26+26)%26);
					charList[i] = this.alphabet.getLetter(((j+k+l+m+n+o+p+q)%26+26)%26); // end of the encryption
					if (this.key.getSequenceRotor().get(rotorInt) == this.rotorList.get(2)){ // moves the rotor to the left if rotor3
						this.key.getSequenceRotor().get(rotorInt).moveLeft();
					} else {
						this.key.getSequenceRotor().get(rotorInt).moveRight(); // moves it to the right otherwise
					}
				}
			}
		}
		String output = new String(charList);
		return output;
	}
}
