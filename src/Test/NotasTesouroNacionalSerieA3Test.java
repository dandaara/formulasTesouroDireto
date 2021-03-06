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
	
	@Test
	public void testValorNominalValoresIguais() {
		nota.setUSSA(3.421000f);
		nota.setUSSB(3.421000f);
		assertEquals(1000.000000f, nota.calculaValorNominal(), 0.000001f);
	}
	
	@Test
	public void testValorNominalValoresUSSBMaiorUSSA() {
		nota.setUSSA(3.321000f);
		nota.setUSSB(3.421000f);
		assertEquals(970.768800f, nota.calculaValorNominal(), 0.000001f);
	}
	
	@Test
	public void testJuros() {
	
		nota.setValorNominal(2.388307f);
		nota.setTaxa(1.000000f);
		nota.setNumeroMeses(12);
		
		assertEquals(0.023883f, nota.calculaJuros(), 0.000001f);
	}
	
	@Test
	public void testJurosSemestrais() {
	
		nota.setValorNominal(2.388307f);
		nota.setTaxa(1.000000f);
		nota.setNumeroMeses(6);
		assertEquals(0.011941f, nota.calculaJuros(), 0.000001f);
	}
	
	@Test
	public void testJurosComValorNominalZero() {
	
		nota.setValorNominal(0.000000f);
		nota.setTaxa(1.000000f);
		nota.setNumeroMeses(6);
		assertEquals(0.000000f, nota.calculaJuros(), 0.000001f);
	}

}
