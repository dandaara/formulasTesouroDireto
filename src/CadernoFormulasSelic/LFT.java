package CadernoFormulasSelic;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;	
import java.util.ArrayList;

public class LFT {

	private float VNA;
	private float VNb;
	private float c;

	public LFT(float _VNb, float _c) {
		setVNb(_VNb);
		setC(_c);
	}

	public float getVNA() {
		return VNA;
	}

	private void setVNA(float vNA) {
		VNA = vNA;
	}

	public float getVNb() {
		return VNb;
	}

	public void setVNb(float vNb) {
		VNb = vNb;
	}

	public float getC() {
		return c;
	}

	public void setC(float c) {
		this.c = c;
	}

	public void calculaValorNominal() {
		setVNA(VNb * c);
	}

	public void calculaFator(ArrayList<Float> taxasSELIC) {

		float fator = 1.00000000f;
		int n = taxasSELIC.size();
		int k;
		for (k = 0; k < n; k++) {
			System.out.println(fator);
			fator = (float)(fator * (float)(1.0f + calculaTaxaSELIC((float)taxasSELIC.get(k))));
			System.out.println(calculaTaxaSELIC(taxasSELIC.get(k)));
		}

		setC(fator);
	}

	public float calculaTaxaSELIC(float taxaDia){

		return (float) (Math.pow(((float)(taxaDia/100 + 1)),(float) (1/252)) - 1);
		
	}

}
