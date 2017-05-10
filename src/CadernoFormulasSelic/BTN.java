package CadernoFormulasSelic;

public class BTN {

	private float PUant;
	private float precoUnitario;
	private float TR; 
	
	
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


	
}
