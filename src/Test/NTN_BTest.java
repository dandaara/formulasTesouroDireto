package Test;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import CadernoFormulasSelic.NTN_B;
import junit.framework.Assert;

@RunWith(Parameterized.class)
public class NTN_BTest {

	NTN_B ntn_b;
	
	float IPCAt;
	float IPCAt0;
	float IPCAt1;
	float VN;
	
	int dc;
	int dct;
	
	float expected;
	
	public NTN_BTest(float iPCAt, float iPCAt0, float iPCAt1, float vN, int dc, int dct, float expected) {
		this.IPCAt = iPCAt;
		this.IPCAt0 = iPCAt0; 
		this.IPCAt1 = iPCAt1;
		this.VN = vN;
		this.dc = dc;
		this.dct = dct;
		this.expected = expected;
	}
	
	@Parameters
	public static Iterable dados() {
		return Arrays.asList(new Object[][]{
			{5.71f, 4.99f, 5.25f, 12.90f, 30, 23, 15.772394f},
			{4.00f, 4.00f, 4.00f, 123.99f, 15, 20, 123.990000f},
			{3.00f, 4.57f, 5.67f, 112.00f, 10, 10, 91.219965f},
			{7.12f, 6.56f, 5.67f, 0.99f, 5, 15, 1.023539f}
			
		});
	}

	@Before
	public void setUp() throws Exception {
		ntn_b = new NTN_B(IPCAt,IPCAt0, IPCAt1, VN, dc, dct);
	}

	@Test
	public void testValorNominal() {
		assertEquals(expected, ntn_b.getVNA(), 0.000001f);
	}

}
