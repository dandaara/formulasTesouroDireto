package Test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import CadernoFormulasSelic.LFT;

public class LFTTest {
	
	LFT lft;

	@Before
	public void setUp() throws Exception {
		lft = new CadernoFormulasSelic.LFT(0.98765432f,0.123456f);
	}

	@Test
	public void testCalculoValorNominal() {
		lft.calculaValorNominal();
		assertEquals(0.121932f, lft.getVNA(), 0.000001f);
		
	}
	
	@Test
	public void testCalculoFator(){
		
		ArrayList<Float> taxas = new ArrayList<Float>();
		taxas.add(14.50f);
		taxas.add(12.50f);
		taxas.add(10.25f);
		
		lft.calculaFator(taxas);
		assertEquals(1.00139290f, lft.getC(), 0.00000001f);
	}

}
