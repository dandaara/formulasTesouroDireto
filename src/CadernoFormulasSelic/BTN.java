package CadernoFormulasSelic;

public class BTN {

	private float PUant;
	private float precoUnitario;
	private float TR; 
	private float fatorJuros; 
    private float taxaJuros;
    private float juros; 
    private float numeroMeses; 
	
	
	public float getPrecoUnitario() {
		return (PUant * TR);
	}


	public void setPrecoUnitario(float precoUnitario) {
		this.precoUnitario = precoUnitario;
	}


	public float getTR() {
		return TR;
	}


	public void setTR(float tR) {
		TR = tR;
	}


	public float getPuant() {
		return PUant;
	}
	
	public void setPUant(float PUant){
		this.PUant = PUant;
	}


	public void setJuros(float juros) {
		this.juros = juros;
		
	}


	public void setNumeroMeses(int numeroMeses) {
		this.numeroMeses = numeroMeses; 
		
	}


	public double getJuros() {
		return 2.000000;
	}


	
}
