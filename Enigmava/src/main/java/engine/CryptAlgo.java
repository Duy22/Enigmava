package engine;

import java.util.ArrayList;

public class CryptAlgo {

	private Key key;

	private String encryptedMessage;

	private String decryptedMessage;

	private Reflector reflector;

	private ArrayList<Rotor> rotorList;
	
	private Alphabet alphabet;
	
	public CryptAlgo(Key k, ArrayList<Rotor> rL, Reflector ref, Alphabet alpha){
		super();
		this.key = k;
		this.encryptedMessage = "";
		this.decryptedMessage = "";
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
	
	public void setEncrypt(String s){
		this.encryptedMessage = s;
	}
	
	public void setDecrypt(String s){
		this.decryptedMessage = s;
	}
	
	public String encrypt(String s){
		
		return s;
	}
	
	public String decrypt(String s){
		
		return s;
	}
}
