package test.harbour;

import static org.junit.Assert.*;

import org.junit.Test;

import main.harbour.UBoot;
import main.harbour.Gioco;
import main.harbour.Invasore;
import main.harbour.AeroPorto;
import main.harbour.CarroArmato;

/**
* NON MODIFICARE
*/
public class GiocoTest {

	@Test
	public void testAttacco() {
		
		AeroPorto p = new AeroPorto();
		p.setDimensioneSqMeters(5000);
		
		Gioco gioco = new Gioco(p);
		
		CarroArmato s = new CarroArmato();
		s.setMissili(13);
		s.setStazza(47);
		
		UBoot a = new UBoot();
		a.setArmaK(10);
		a.setArmaH(20);
		
		Invasore[] invasoriA = new Invasore[]{ s, a };
		/*
		 * L'attacco somma la potenza di fuoco degli invasori e 
		 * distrugge il porto secondo questa equazione:
		 * metri_quadri_distrutti_del_porto = potenza_di_fuoco_invasori * 2.5
		 */
		gioco.attacco(invasoriA);
		assertFalse(gioco.portoDistrutto());
		
		UBoot a2 = new UBoot();
		a2.setArmaK(10);
		a2.setArmaH(20);
		
		Invasore[] invasoriB = new Invasore[]{ s, a, a2 };
		gioco.attacco(invasoriB);
		assertTrue(gioco.portoDistrutto());
		
	}

}
