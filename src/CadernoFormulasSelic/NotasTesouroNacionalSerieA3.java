package CadernoFormulasSelic;

public class NotasTesouroNacionalSerieA3 {
	
	private float USSA;
	private float USSB;
	private float valorNominal;
	private float taxa;
	private float numeroMeses;


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

	public float getTaxa() {
		return taxa;
	}

	public void setTaxa(float taxa) {
		this.taxa = taxa;
	}

	public float getNumeroMeses() {
		return numeroMeses;
	}

	public void setNumeroMeses(float numeroMeses) {
		this.numeroMeses = numeroMeses;
	}

	public float calculaJuros() {
		return (this.getValorNominal()*calculaFator());

	}

	private float calculaFator() {
		
	return ((this.getTaxa()/100)*(this.getNumeroMeses()/12));

	}
	
}


