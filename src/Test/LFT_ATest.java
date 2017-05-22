package Test;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import CadernoFormulasSelic.LFT_A;

@RunWith(Parameterized.class)
public class LFT_ATest {
	
	LFT_A lfta;
	float VE;
	float c;
	int Du;
	int Dut;
	int p;
	int n;
	float expected;
	
	float VNA_jur;
	float fator_jur;
	float i_jur;
	int n_jur;
	int dc_jur;
	int dcp_jur;
	
	public LFT_ATest(float vE, float c, int du, int dut, int p, int n, float expected) {
		this.VE = vE;
		this.c = c;
		this.Du = du;
		this.Dut = dut;
		this.p = p;
		this.n = n;
		this.expected = expected;
		
		
	}
	
	@Parameters
	public static Iterable dados() {
		return Arrays.asList(new Object[][]{
			{23.098761f, 0.00053746f, 5, 10, 180, 100, 0.01225910f},
			{1.000001f, 1.20000030f, 10, 23, 150, 29, 1.19010698f},
			{23.098761f, 0.00053746f, 5, 10, 180, 179, -0.00014963f}
		});
	}

	@Before
	public void setUp() throws Exception {
		lfta = new LFT_A(VE, c, Du,Dut, p, n);
		
	}

	@Test
	public void testLTF_AValorNominal() {
		assertEquals(expected, lfta.getVNa(), 0.00000001);
	}

}
