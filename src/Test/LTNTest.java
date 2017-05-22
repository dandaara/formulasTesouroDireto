package Test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class LTNTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testPrecoUnitario() {
		assertEquals(0.001, LTN.getPU(), 0,000001);;
	}

}
