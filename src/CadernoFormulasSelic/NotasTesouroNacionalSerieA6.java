package CadernoFormulasSelic;

import org.joda.time.DateTime;
import org.joda.time.Duration;

public class NotasTesouroNacionalSerieA6 {
	
	private float USSA;
	private float USSB;
	private float valorNominal;
	private float valorEmissao;
	private float fator;
	
	
	public float getUSSA() {
		return USSA;
	}
	public void setUSSA(float uSSA) {
		USSA = uSSA;
	}
	public float getUSSB() {
		return USSB;
	}
	public void setUSSB(float uSSB) {
		USSB = uSSB;
	}
	public float getValorNominal() {
		return valorNominal;
	}
	public void setValorNominal(float valorNominal) {
		this.valorNominal = valorNominal;
	}

	public double calculaValorNominal() {
		return ((this.getUSSA()/this.getUSSB())*this.getValorEmissao());
	}
	public float getValorEmissao() {
		return valorEmissao;
	}
	public void setValorEmissao(float valorEmissao) {
		this.valorEmissao = valorEmissao;
	}
	
	public float getFator() {
		return fator;
	}
	public void setFator(float fator) {
		this.fator = fator;
	}
	
	public float calculaFator(String dtp, String dtup, float taxa) {	
		return 0;
	}

	public float calculaJuros() {
		return 0;
	}

}
