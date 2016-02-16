package test.harbour;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.harbour.CarroArmato;

/**
* NON MODIFICARE
*/
public class CarroArmatoTest {

	@Test
	public void testPotenzaFuoco() {
		CarroArmato s = new CarroArmato();
		s.setMissili(13);
		s.setStazza(47);
		int pf = s.potenzaFuoco();
		
		// la potenza di fuoco è il
		// 30% del prodotto tra numero di missili e stazza.
		// il valore è arrotondato all'intero più vicino.
		assertEquals(183, pf);
	}

}
