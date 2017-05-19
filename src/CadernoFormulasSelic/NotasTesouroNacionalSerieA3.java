package CadernoFormulasSelic;

public class NotasTesouroNacionalSerieA3 {
	
	private float USSA;
	private float USSB;
	private float valorNominal;


	public float calculaValorNominal() {
		return (this.getUSSA()/this.getUSSB())*1000.0000000f;
		
	}
	
	public void setUSSA(float ussa) {
		this.USSA = ussa;
	}

	public void setUSSB(float ussb) {
		this.USSB = ussb;
	}

	public float getValorNominal() {
		return valorNominal;
	}

	public void setValorNominal(float valorNominal) {
		this.valorNominal = valorNominal;
	}

	public float getUSSA() {
		return USSA;
	}

	public float getUSSB() {
		return USSB;
	}
	
}


