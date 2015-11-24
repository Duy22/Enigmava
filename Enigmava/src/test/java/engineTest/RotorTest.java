package engineTest;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import engine.Rotor;

public class RotorTest {

	private Rotor rot;
	
	@Before
	public void setUp() throws Exception {
		rot = new Rotor();
	}

	@After
	public void tearDown() throws Exception {
		rot = null;
	}

	@Test
	public void testRotor() {
		assertEquals(26, rot.getUpperLane().size());
		assertEquals(26, rot.getLowerLane().size());
	}

	@Test
	public void testGetRotor() {
		Rotor rot2 = new Rotor();
		assertEquals(5, rot2.getUpperLaneValue(5));
		assertEquals(50, rot2.getLowerLaneValue(5));
		assertEquals(0, rot2.getCurrentPosition());
	}

	@Test
	public void testGetUpperLane() {
		assertEquals(5, rot.getUpperLaneValue(5));
	}

	@Test
	public void testGetLowerLane() {
		assertEquals(50, rot.getLowerLaneValue(5));
	}

	@Test
	public void testGetCurrentPosition() {
		assertEquals(0, rot.getCurrentPosition());
	}

	@Test
	public void testSetUpperLane() {
		rot.setUpperLane(6, 78);
		assertEquals(78, rot.getUpperLaneValue(6));
	}

	@Test
	public void testSetLowerLane() {
		rot.setLowerLane(6, 78);
		assertEquals(78, rot.getLowerLaneValue(6));
	}

	@Test
	public void testSetCurrentPosition() {
		rot.setCurrentPosition(56);
		assertEquals(56, rot.getCurrentPosition());
	}

	@Test
	public void testMoveLeft() {
		ArrayList<Integer> refUp = new ArrayList<Integer>();
		for (int j=0;j<26;j++){
			int value = rot.getUpperLaneValue(j);
			refUp.add(j, value);
		}
		ArrayList<Integer> refLow = new ArrayList<Integer>();
		
		for (int j=0;j<26;j++){
			int value = rot.getLowerLaneValue(j);
			refLow.add(j, value);
		}
		
		rot.moveLeft();
		
		int expectedUp25 = refUp.get(0);
		int actualUp25 = rot.getUpperLaneValue(25);
		assertEquals(expectedUp25, actualUp25);
		
		for (int i=0;i<25;i++){
			int expected = refUp.get(i+1);
			int actual = rot.getUpperLaneValue(i);
			assertEquals(expected, actual);
		}
		
		int expectedDown25 = refLow.get(0);
		int actualDown25 = rot.getLowerLaneValue(25);
		assertEquals(expectedDown25, actualDown25);
		
		for (int i=0;i<25;i++){
			int expected = refLow.get(i+1);
			int actual = rot.getLowerLaneValue(i);
			assertEquals(expected, actual);
		}
	}
/*
	@Test
	public void testMoveRight() {
		fail("Not yet implemented");
	}
*/
}
