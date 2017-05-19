package CadernoFormulasSelic;

public class LFT {

	private float VNA;
	private float VNb;
	private float c;
	
	
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
	
	public void calculaValorNominal(){
		setVNA(VNb * c);
	}
	
	public void calculaFator(){
		setC(0.0001f);
	}
	
	

}
