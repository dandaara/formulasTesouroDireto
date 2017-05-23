package Test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import CadernoFormulasSelic.NotasTesouroNacionalSerieA1;

public class NotasTesouroNacionalSerieA1Test {


	NotasTesouroNacionalSerieA1 nota; 
	
	@Before
	public void setUp() throws Exception {
		
		nota = new NotasTesouroNacionalSerieA1();
	}

	@Test
	public void testPrecoUnitarioAmortizado() {
		nota.setUSSA(3.421000f);
		nota.setUSSB(3.321000f);
		nota.setValorEmissao(2.000000f);
		nota.setPercentualAmortizacao(0.200000f);
		assertEquals(0.412044456f, nota.calculaPrecoUnitarioAmortizado(), 0.000001f);
	}
	
	@Test
	public void testPrecoUnitarioAmortizacaoIgualZero() {
		nota.setUSSA(3.421000f);
		nota.setUSSB(3.321000f);
		nota.setValorEmissao(2.000000f);
		nota.setPercentualAmortizacao(0.200000f);
		assertEquals(0.412044456f, nota.calculaPrecoUnitarioAmortizado(), 0.000001f);
	}
	
	@Test
	public void testPrecoUnitarioAmortizacaoValoresIguais() {
		nota.setUSSA(3.421000f);
		nota.setUSSB(3.421000f);
		nota.setValorEmissao(2.000000f);
		nota.setPercentualAmortizacao(0.200000f);
		assertEquals(0.400000f, nota.calculaPrecoUnitarioAmortizado(), 0.000001f);
	}
	
	@Test
	public void testPrecoUnitarioAmortizacaoValoresUSSBMaiorUSSA() {
		nota.setUSSA(3.321000f);
		nota.setUSSB(3.421000f);
		nota.setValorEmissao(2.000000f);
		nota.setPercentualAmortizacao(0.200000f);
		assertEquals(0.388307f, nota.calculaPrecoUnitarioAmortizado(), 0.000001f);
	}
	
	@Test
	public void testJuros() {
		String dtp= "2014-06-15T08:00:55Z";
		String dtup= "2014-07-13T08:00:55Z";
		float taxa = 1.200000f;
		
		nota.setPrecoUnitarioAmortizado(2.388307f);
		nota.setFator(0);
		nota.addFator(dtp,dtup,taxa);
		
		assertEquals(0.002229f, nota.calculaJuros(), 0.000001f);
	}
	
	@Test
	public void testJurosComVariosFatores() {
		String dtp1= "2014-06-15T08:00:55Z";
		String dtup1= "2014-07-13T08:00:55Z";
		float taxa1 = 1.200000f;
		
		String dtp2= "2014-06-15T08:00:55Z";
		String dtup2= "2014-07-13T08:00:55Z";
		float taxa2 = 1.200000f;
		
		String dtp3= "2014-06-15T08:00:55Z";
		String dtup3= "2014-07-13T08:00:55Z";
		float taxa3 = 1.200000f;
		
		
		nota.setPrecoUnitarioAmortizado(0.388307f);
		nota.setFator(0);
		nota.addFator(dtp1,dtup1,taxa1);
		nota.addFator(dtp2,dtup2,taxa2);
		nota.addFator(dtp2,dtup2,taxa3);
		assertEquals(0.001087f, nota.calculaJuros(), 0.000001f);
	}
	
	@Test
	public void testJurosComPrecoUnitarioZero() {
		String dtp1= "2014-06-15T08:00:55Z";
		String dtup1= "2014-07-13T08:00:55Z";
		float taxa1 = 1.200000f;
		
		String dtp2= "2014-06-15T08:00:55Z";
		String dtup2= "2014-07-13T08:00:55Z";
		float taxa2 = 1.200000f;
		
		String dtp3= "2014-06-15T08:00:55Z";
		String dtup3= "2014-07-13T08:00:55Z";
		float taxa3 = 1.200000f;
		
		
		nota.setPrecoUnitarioAmortizado(0.0000f);
		nota.setFator(0);
		nota.addFator(dtp1,dtup1,taxa1);
		nota.addFator(dtp2,dtup2,taxa2);
		nota.addFator(dtp2,dtup2,taxa3);
		assertEquals(0.000000f, nota.calculaJuros(), 0.000001f);
	}

}
