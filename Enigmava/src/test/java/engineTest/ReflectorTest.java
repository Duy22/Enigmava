package engineTest;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import engine.Reflector;

public class ReflectorTest {
	private Reflector ref;
	
	
	@Before
	public void setUp() throws Exception {
		ref = new Reflector();
	}

	@After
	public void tearDown() throws Exception {
		ref = null;
	}
	
	@Test
	public void getNumListTest() {
		ArrayList<Integer> list1 = ref.getNumList();
		assertEquals(ref.getNumList(), list1);
	}
	
	@Test
	public void constructorTest(){
		assertEquals(26, ref.getNumList().size());
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

	@Test
	public void getReflectorTest() {
		Reflector ref2 = ref.getReflector();
		assertEquals(ref, ref2);
	}

}
