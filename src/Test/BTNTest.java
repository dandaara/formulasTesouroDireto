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
		assertEquals(0.020000f, btn.getPrecoUnitario(), 0.000001f);
	}

}
