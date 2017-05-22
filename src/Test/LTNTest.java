package Test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import CadernoFormulasSelic.LTN;

public class LTNTest {
	
	LTN ltn;

	@Before
	public void setUp() throws Exception {
		ltn = new LTN(10.10);
	}

	@Test
	public void testPrecoUnitario() {
		assertEquals(0.000123f, ltn.getPrecoUnitario(), 0.000001);
	}

}
