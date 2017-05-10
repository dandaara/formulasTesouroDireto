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
		btn.setTR(0.038800f);
		btn.setPUant(1.965789f);
	}

	@Test
	public void testPrecoUnitarioAtualizado(){
		assertEquals(0.076400f, btn.getPrecoUnitario(), 0.000001);
	}

}
