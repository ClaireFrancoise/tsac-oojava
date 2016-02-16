package test.harbour;

import static org.junit.Assert.*;

import org.junit.Test;

import main.harbour.AeroPorto;

/**
* NON MODIFICARE
*/
public class AeroPortoTest {

	private static final double EPSILON = 0.01;
	
	@Test
	public void testAddMetriQuadriDistrutti() {
		
		AeroPorto p = new AeroPorto();
		p.setDimensioneSqMeters(20);
		
		assertEquals(20, p.getDimensioneSqMeters(), EPSILON);
		assertEquals(20, p.getDimensioneSqMetersNonDistrutta(), EPSILON);
		
		p.addMetriQuadriDistrutti(12.5);
		assertEquals(20, p.getDimensioneSqMeters(), EPSILON);
		assertEquals(7.5, p.getDimensioneSqMetersNonDistrutta(), EPSILON);
		
		p.addMetriQuadriDistrutti(12.5);
		assertEquals(20, p.getDimensioneSqMeters(), EPSILON);
		assertEquals(0, p.getDimensioneSqMetersNonDistrutta(), EPSILON);
		
	}

}
