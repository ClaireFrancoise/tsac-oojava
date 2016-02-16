package test.harbour;

import static org.junit.Assert.*;

import org.junit.Test;

import main.harbour.UBoot;

/**
* NON MODIFICARE
*/
public class UBootTest {

	@Test
	public void testPotenzaFuoco() {
		UBoot a = new UBoot();
		a.setArmaK(10);
		a.setArmaH(20);
		int pf = a.potenzaFuoco();
		
		// la potenza di fuoco è 20 volte il numero di ArmiK e 
		// 30 volte il numero di ArmiH
		assertEquals(800, pf);
	}

}
