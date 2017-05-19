package Test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import CadernoFormulasSelic.NotasTesouroNacionalSerieA1;
import CadernoFormulasSelic.NotasTesouroNacionalSerieA3;

public class NotasTesouroNacionalSerieA3Test {

	NotasTesouroNacionalSerieA3 nota;
	
	@Before
	public void setUp() throws Exception {	
		nota = new NotasTesouroNacionalSerieA3();
	}
	
	
	@Test
	public void testValorNominal() {
		nota.setUSSA(3.421000f);
		nota.setUSSB(3.321000f);
		assertEquals(1030.111450, nota.calculaValorNominal(), 0.000001f);
	}

}
