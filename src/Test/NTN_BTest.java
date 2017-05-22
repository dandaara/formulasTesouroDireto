package Test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import CadernoFormulasSelic.NTN_B;
import junit.framework.Assert;

public class NTN_BTest {

	NTN_B ntn_b;
	
	@Before
	public void setUp() throws Exception {
		ntn_b = new NTN_B(5.71f, 4.99f);
	}

	@Test
	public void testValorNominal() {
		assertEquals(1.022231f, ntn_b.getVNA(), 0.000001f);
	}

}
