package engineTest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import engine.Alphabet;

public class AlphabetTest {

	private Alphabet abc;
	
	@Before
	public void setUp() throws Exception {
		abc = new Alphabet();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAlphabet() {
		assertEquals(26, abc.getAlphaList().size());
	}

	@Test
	public void testGetLetter() {
		assertEquals('a', abc.getLetter(0));
		assertEquals('z', abc.getLetter(25));
		assertEquals('j', abc.getLetter(9));
	}

	@Test
	public void testGetAlphabet() {
		Alphabet efg = abc.getAlphabet();
		assertEquals(abc, efg);
	}

}
