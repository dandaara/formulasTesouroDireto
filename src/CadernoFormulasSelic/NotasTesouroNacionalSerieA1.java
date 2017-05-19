package CadernoFormulasSelic;

import org.joda.time.DateTime;
import org.joda.time.Duration;

public class NotasTesouroNacionalSerieA1 {
	
	private float USSA;
	private float USSB;
	private float valorEmissao;
	private float percentualAmortizacao;
	private float precoUnitarioAmortizado;
	private float fator;
	
	
	public NotasTesouroNacionalSerieA1() {
		
	}
	
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
	public float getValorEmissao() {
		return valorEmissao;
	}
	public void setValorEmissao(float valorEmissao) {
		this.valorEmissao = valorEmissao;
	}
	public float getPercentualAmortizacao() {
		return percentualAmortizacao;
	}
	public void setPercentualAmortizacao(float percentualAmortizacao) {
		this.percentualAmortizacao = percentualAmortizacao;
	} 

	public float getFator() {
		return fator;
	}
	public void setFator(float fator) {
		this.fator = fator;
	}
	public float getPrecoUnitarioAmortizado() {
		return precoUnitarioAmortizado;
	}	
	
	public float calculaPrecoUnitarioAmortizado() {
		return (getUSSA()/getUSSB())*calculaValorLiquido();
	}
	
	public float calculaValorLiquido() {
		return getValorEmissao()*getPercentualAmortizacao();
	}
	
	public void setPrecoUnitarioAmortizado(float precoUnitario) {
		this.precoUnitarioAmortizado= precoUnitario;
		
	}
	public void addFator(String dtp, String dtup, float taxa) {
		System.out.println("Calccula: "+calculaFator(dtp, dtup, taxa)+ " ");
		this.fator = this.fator + calculaFator(dtp, dtup, taxa);
		System.out.println("Fator: "+this.fator+ " ");
		
	}
	private float calculaFator(String dtp, String dtup, float taxa) {
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
		System.out.println("PU "+getPrecoUnitarioAmortizado()+ " ");
		System.out.println("FatorFinal "+this.getFator()+ " ");
		return this.getPrecoUnitarioAmortizado()*this.getFator();
	}

}
