package Test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import CadernoFormulasSelic.NotasTesouroNacionalSerieA6;

public class NotasTesouroNacionalSerieA6Test {

	NotasTesouroNacionalSerieA6 nota;
	
	@Before
	public void setUp() throws Exception {	
		nota = new NotasTesouroNacionalSerieA6();
	}
	
	
	@Test
	public void testValorNominal() {
		nota.setUSSA(3.421000f);
		nota.setUSSB(3.321000f);
		nota.setValorEmissao(1000.0000);
		assertEquals(1030.111450, nota.calculaValorNominal(), 0.000001f);
	}

}
