package Test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class LFT_ATest {

	@Before
	public void setUp() throws Exception {
		LFT_A lfta = new LFT_A(0.000537464, 23.098761, 0.0245, 5, 10, 180, 100);
		
	}

	@Test
	public void test() {
		assertEquals(0.01085123, lfta.getVNa());
	}

}
