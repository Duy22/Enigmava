package engineTest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import engine.Key;
import engine.Rotor;

public class KeyTest {
	
	private Rotor rotor1;
	private Rotor rotor2;
	private Rotor rotor3;
	private Key key;

	@Before
	public void setUp() throws Exception {
		rotor1 = new Rotor();
		rotor2 = new Rotor();
		rotor3 = new Rotor();
		key = new Key(rotor1, rotor2, rotor3);
	}

	@After
	public void tearDown() throws Exception {
		rotor1 = null;
		rotor2 = null;
		rotor3 = null;
		key = null;
	}

	@Test
	public void testKey() {
		assertEquals(3, key.getSequenceRotor().size());
		assertEquals(3, key.getSequenceInit().size());
	}

	@Test
	public void testSetSequenceRotor() {
		Rotor rotor4 = new Rotor();
		key.setSequenceRotor(2, rotor4);
		assertEquals(rotor4, key.getSequenceRotor().get(2));
		assertEquals(3, key.getSequenceRotor().size());
	}

	@Test
	public void testSetSequenceInit() {
		int init = 22;
		key.setSequenceInit(1, init);
		assertEquals(22, (int)key.getSequenceInit().get(1));
	}

}
