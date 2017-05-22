package Test;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import CadernoFormulasSelic.LTN;
@RunWith(Parameterized.class)
public class LTNTest {
	
	LTN ltn;
	float tInd;
	float expected;
	
	public LTNTest(float tInd, float expected) {
		this.tInd = tInd;
		this.expected = expected;
	}

	@Parameters
	public static Iterable dados(){
		return Arrays.asList(new Object[][]{
			{10.20f, 990.458849f},
			{0.35f, 998.809817f},
			{1.99f, 995.663108f}
		});
	}
	
	@Before
	public void setUp() throws Exception {
		ltn = new LTN(tInd);
	}

	@Test
	public void testPrecoUnitario() {
		assertEquals(expected, ltn.getPrecoUnitario(), 0.000001);
	}

}
