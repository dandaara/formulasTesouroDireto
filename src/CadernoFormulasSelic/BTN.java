package CadernoFormulasSelic;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BTN {

	private float PUant;
	private float precoUnitario;
	private float TR; 
	private float fatorJuros; 
    private float taxaJuros;
    private float juros; 
    private float numeroMeses; 
	
	
	public float calculaPrecoUnitario() {
		float precoUnitario = PUant * TR;
		setPrecoUnitario(precoUnitario);
		return precoUnitario;
	}
	
	public float getPrecoUnitario() {
		return this.precoUnitario;
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

	public float getJuros() {
		return getFatorJuros()*getPrecoUnitario(); 
	}
	
	public float getFatorJuros() {
        return calculaFatorJuros();
    }
	
	public void setTaxaJuros(float taxa) {
		this.taxaJuros = taxa; 
		
	}
	
	 private float calculaFatorJuros(){
		 
		 float divisaoTaxa =(this.taxaJuros/100.0f)+1.0f;
		 float potencia = this.numeroMeses/12;
		 float resultadoPotencia = (float)Math.pow(divisaoTaxa, potencia);
		 float fatorJuros = resultadoPotencia -1;
		 
		 setFatorJuros(fatorJuros);
		 return fatorJuros; 
	        
	  
	 }
	 
	 private void setFatorJuros(float fatorJuros2) {
		this.fatorJuros = fatorJuros2;
		
	}

}
