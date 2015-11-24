package engineTest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import engine.Reflector;

public class ReflectorTest {
	private Reflector ref;
	
	//Reflector ref = new Reflector();
	
	@Before
	public void setUp() throws Exception {
		ref = new Reflector();
	}


	@Test
	public void getNumTest() {
		int n = ref.getNum(5);
		assertEquals(n, 5);
	}
	
	@Test
	public void setNumTest() {
		ref.setNum(7, 89);
		assertEquals(ref.getNum(7), 89);
	}

	@After
	public void tearDown() throws Exception {
		ref = null;
	}
}
