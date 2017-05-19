package Test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import CadernoFormulasSelic.LFT;

public class LFTTest {

	@Before
	public void setUp() throws Exception {
		LFT lft = new CadernoFormulasSelic.LFT();
	}

	@Test
	public void testCalculaValorNominal() {
		
		assertEquals(0.000000f, LFT.calculaValorNominal(), 0.1f);
		
		
	}

}
