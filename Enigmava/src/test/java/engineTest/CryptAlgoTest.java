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
		assertEquals(sl, v);
		assertNotEquals(sl, u);
	}

}
