package Test;


import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import CadernoFormulasSelic.BTN;

public class BTNTest {
	
	BTN btn; 
	
	@Before
	public void setUP(){
		btn = new BTN();
	}

	@Test
	public void testPrecoUnitarioAtualizado(){
		btn.setTR(0.100000f);
		btn.setPUant(0.200000f);
		assertEquals(0.020000f, btn.calculaPrecoUnitario(), 0.000001f);
	}
	
	   @Test
	    public void testPrecoUnitarioAtualizadoValoresAleatorios(){
	        btn.setTR(0.038800f);
	        btn.setPUant(1.965789f);
	        assertEquals(0.076272f, btn.calculaPrecoUnitario(), 0.000001f);
	    }
	    
	    @Test
	    public void testPrecoUnitarioAtualizadoValoresMaioresQueZero(){
	        btn.setTR(1.000000f);
	        btn.setPUant(2.000000f);
	        assertEquals(2.000000f, btn.calculaPrecoUnitario(), 0.000001f);
	    }
	    
	    @Test
	    public void testPrecoUnitarioAtualizadoValoresIguaisAZero(){
	        btn.setTR(0.000000f);
	        btn.setPUant(2.000000f);
	        assertEquals(0.000000f, btn.calculaPrecoUnitario(), 0.000001f);
	    }
	    
	    @Test
	    public void testJuros(){
	        btn.setPrecoUnitario(2.000000f);
	        btn.setTaxaJuros(1.000000f);
	        btn.setNumeroMeses(6);
	        assertEquals(0.009975, btn.getJuros(), 0.000001f);
	    }
	    
	    @Test
	    public void testJurosZero(){
	        btn.setPrecoUnitario(0.000000f);
	        btn.setTaxaJuros(1.000000f);
	        btn.setNumeroMeses(6);
	        assertEquals(0.000000, btn.getJuros(), 0.000001f);
	    }
	    
	    @Test
	    public void testJurosMaiorQueUM(){
	        btn.setPrecoUnitario(300.000000f);
	        btn.setTaxaJuros(800.000000f);
	        btn.setNumeroMeses(12);
	        assertEquals(2400.000000, btn.getJuros(), 0.000001f);
	    }
	    
	    @Test
	    public void testValorPrincipal(){
	        btn.setPrecoUnitario(5.000000f);
	        btn.setPrecoUnitarioDolar(2.000000f);
	        btn.setDeflator( 0.772f);
	        btn.setQuantidade(15);
	        assertEquals(75.000000, btn.calculaValorPrincipal(), 0.000001f);
	    }
	    
	    @Test
	    public void testValorPrincipalPrecoUnitarioDolarDeflator1(){
	        btn.setPrecoUnitario(5.000000f);
	        btn.setPrecoUnitarioDolar(7.000000f);
	        btn.setDeflator( 0.772f);
	        btn.setQuantidade(20);
	        assertEquals(108.080001, btn.calculaValorPrincipal(), 0.000001f);
	    }
	    
	    @Test
	    public void testValorPrincipalPrecoUnitarioDolarDeflator2(){
	        btn.setPrecoUnitario(5.000000f);
	        btn.setPrecoUnitarioDolar(7.000000f);
	        btn.setDeflator( 0.7852f);
	        btn.setQuantidade(20);
	        assertEquals(109.927993, btn.calculaValorPrincipal(), 0.000001f);
	    }
	    
	    @Test
	    public void testValorPrincipalPrecoUnitarioDolarDeflator3(){
	        btn.setPrecoUnitario(5.000000f);
	        btn.setPrecoUnitarioDolar(7.000000f);
	        btn.setDeflator(0.6457f);
	        btn.setQuantidade(20);
	        assertEquals(90.397994, btn.calculaValorPrincipal(), 0.000001f);
	    }    

}
