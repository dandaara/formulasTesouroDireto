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
		nota.setValorEmissao(1000.0000f);
		assertEquals(1030.111450, nota.calculaValorNominal(), 0.000001f);
	}
	
	@Test
	public void testValorNominalValoresIguais() {
		nota.setUSSA(3.421000f);
		nota.setUSSB(3.421000f);
		nota.setValorEmissao(1000.0000f);
		assertEquals(1000.000000f, nota.calculaValorNominal(), 0.000001f);
	}
	
	@Test
	public void testValorNominalValoresUSSBMaiorUSSA() {
		nota.setUSSA(3.321000f);
		nota.setUSSB(3.421000f);
		nota.setValorEmissao(1000.0000f);
		assertEquals(970.768800f, nota.calculaValorNominal(), 0.000001f);
	}
	
	@Test
	public void testJuros() {
		String dtp= "2014-06-15T08:00:55Z";
		String dtup= "2014-07-13T08:00:55Z";
		float taxa = 1.200000f;
		
		nota.setValorNominal(2.388307f);
		nota.setFator(nota.calculaFator(dtp,dtup,taxa));
		assertEquals(0.002229f, nota.calculaJuros(), 0.000001f);
	}

}
