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
		float fator = ((calculaSubtracaodatas(dtp,dtup)/360)*(taxa/100));
		return fator;
	}
	
	private float calculaSubtracaodatas(String dtp, String dtup) {

		DateTime dtp1 = new DateTime(DateTime.parse(dtp));
		DateTime dtup2 = new DateTime(DateTime.parse(dtup)); 
		Duration dur = new Duration(dtp1, dtup2);
		
		System.out.println(dur.getStandardDays());
		
		float dias= dur.getStandardDays();
		return dias;
	}
	
	public float calculaJuros() {
		return this.getValorNominal()*this.getFator();
	}



}
