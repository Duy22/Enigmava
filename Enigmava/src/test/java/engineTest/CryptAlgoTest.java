package engineTest;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import engine.Alphabet;
import engine.CryptAlgo;
import engine.Key;
import engine.Reflector;
import engine.Rotor;

public class CryptAlgoTest {

	private CryptAlgo algo;
	private Alphabet abc;
	private Reflector ref;
	private Rotor rot1;
	private Rotor rot2;
	private Rotor rot3;
	private Key k;
	private ArrayList<Rotor> rotList;
	
	@Before
	public void setUp() throws Exception {
		abc = new Alphabet();
		ref = new Reflector();
		rot1 = new Rotor();
		rot2 = new Rotor();
		rot3 = new Rotor();
		k = new Key(rot1, rot2, rot3);
		rotList = new ArrayList<Rotor>();
		rotList.add(0, rot1);
		rotList.add(1, rot2);
		rotList.add(2, rot3);
		algo = new CryptAlgo(k, rotList, ref, abc);
		
	}

	@After
	public void tearDown() throws Exception {
		algo = null;
		abc = null;
		ref = null;
		rot1 = null;
		rot2 = null;
		rot3 = null;
		k = null;
	}

	@Test
	public void testEncrypt() {
		String s = "Lorem ipsum dolor sit amet, has viris doctus hendrerit eu, "
				+ "expetenda elaboraret in sed. Enim magna ei cum, harum vituperatoribus "
				+ "et eam. Assum signiferumque et usu. Ea nam illud intellegat, his no labitur "
				+ "repudiare, ne etiam doming melius his.";
		
		String sl = s.toLowerCase();
		algo.setInput(sl);
		String u = algo.encrypt();
		algo.setInput(u);
		String v = algo.encrypt();
		assertEquals(sl, v); // tests that the original message is the same as the double encrypted message
		assertNotEquals(sl, u); // tests that the original message and the simple encrypted message are different
		
		//Modifying the rotor sequence
		k.setSequenceRotor(0, rot3);
		k.setSequenceRotor(1, rot1);
		k.setSequenceRotor(2, rot2);
		algo.setInput(sl);
		String x = algo.encrypt();
		algo.setInput(x);
		String y = algo.encrypt();
		assertEquals(sl, y);// tests that the original message is the same as the double encrypted message
		assertNotEquals(x, y);// tests that the original message and the simple encrypted message are different
		assertNotEquals(x, u);// tests that the encrypted message is different from the previous encrypted message
		
		//Modifying the initial positions of the rotors
		k.setSequenceInit(0, 5);
		k.setSequenceInit(1, -69);
		k.setSequenceInit(2, 10);
		algo.setInput(sl);
		String a = algo.encrypt();
		algo.setInput(a);
		String b = algo.encrypt();
		algo.setInput(b);
		assertEquals(sl, b);// tests that the original message is the same as the double encrypted message
		assertNotEquals(a, b);// tests that the original message and the simple encrypted message are different
		assertNotEquals(x, a);// tests that the encrypted message is different from the previous encrypted message
		
		
		
	}

}
