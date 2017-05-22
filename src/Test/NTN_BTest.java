package Test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class NTN_BTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testValorNominal() {
		assertEquals(1.022231f, NTN_B.getVNA());
	}

}
