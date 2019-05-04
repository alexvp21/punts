package segment;

import org.junit.*;

import punts.Punt;

import static org.junit.Assert.*; // importa una classe static

public class TestSegment {	
	@Test
	public void testLongitud() {
		Segment segTest = new Segment(new Punt(10, 5), new Punt(3, 5));
		
		assertEquals(7.0, segTest.getLongitud(), 0);
	}
	
	
	public static void main(String args[]) {
		org.junit.runner.JUnitCore.main("TestPunt");
	}
}