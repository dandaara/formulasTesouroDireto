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

}
