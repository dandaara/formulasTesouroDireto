package Test;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.sun.org.apache.xpath.internal.ExtensionsProvider;

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
	
	float VNA_juros;
	float i_juros;
	int n_juros;
	int dcp_juros;
	int dct_juros;
	float expected_juros;
	
	
	public NTN_BTest(float iPCAt, float iPCAt0, float iPCAt1, float vN, int dc, int dct, float expected,
			float vna, float i_juros, int n_juros, int dcp_juros, int dct_juros, float expected_juros) {
		this.IPCAt = iPCAt;
		this.IPCAt0 = iPCAt0; 
		this.IPCAt1 = iPCAt1;
		this.VN = vN;
		this.dc = dc;
		this.dct = dct;
		this.expected = expected;
		
		this.VNA_juros = vna;
		this.i_juros = i_juros;
		this.n_juros = n_juros;
		this.dcp_juros = dcp_juros;
		this.dct_juros = dct_juros;
		this.expected_juros = expected_juros;
		
		
	}
	
	@Parameters
	public static Iterable dados() {
		return Arrays.asList(new Object[][]{
			{5.71f, 4.99f, 5.25f, 12.90f, 30, 23, 15.772394f, 
				12.123456f, 8f,	6,	15,	10, 0.720365f},
			{4.00f, 4.00f, 4.00f, 123.99f, 15, 20, 123.990000f,
					5000.456777f, 9f, 12, 3, 10, 130.963965f},
			{3.00f, 4.57f, 5.67f, 112.00f, 10, 10, 91.219965f,
						1.642357f, 10f,	2,	5,	5, 0.026297f},
			{7.12f, 6.56f, 5.67f, 0.99f, 5, 15, 1.023539f,
							0.987766f, 1.99f, 12, 3, 4, 0.014706f}
			
		});
	}

	@Before
	public void setUp() throws Exception {
		ntn_b = new NTN_B(IPCAt,IPCAt0, IPCAt1, VN, dc, dct, 
				VNA_juros,i_juros, n_juros, dcp_juros, dct_juros);
	}

	@Test
	public void testValorNominal() {
		assertEquals(expected, ntn_b.getVNA(), 0.000001f);
	}
	
	@Test
	public void testJuros(){
		assertEquals(expected_juros, ntn_b.getJuros(), 0.000001f);
	}

}
