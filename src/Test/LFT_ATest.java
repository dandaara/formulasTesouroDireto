package Test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import CadernoFormulasSelic.LFT_A;

public class LFT_ATest {
	
	LFT_A lfta;

	@Before
	public void setUp() throws Exception {
		lfta = new LFT_A(0.000537464f, 23.098761f, 5, 10, 180, 100);
		
	}

	@Test
	public void test() {
		assertEquals(0.01085123, lfta.getVNa(), 0.00000001);
	}

}
