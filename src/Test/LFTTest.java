package Test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import CadernoFormulasSelic.LFT;

public class LFTTest {
	
	LFT lft;

	@Before
	public void setUp() throws Exception {
		lft = new CadernoFormulasSelic.LFT();
		lft.setC(0.123456f);
		lft.setVNb(0.98765432f);
	}

	@Test
	public void testCalculoValorNominal() {
		lft.calculaValorNominal();
		assertEquals(0.121932f, lft.getVNA(), 0.000001f);
		
	}
	
	@Test
	public void testCalculoFator(){
		assertEquals(0.0001f, lft.getC(), 0.0001f);
	}

}
