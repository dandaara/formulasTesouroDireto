package CadernoFormulasSelic;

public class NotasTesouroNacionalSerieA1 {
	
	private float USSA;
	private float USSB;
	private float valorEmissao;
	private float percentualAmortizacao;
	private float precoUnitarioAmortizado;
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
		
		
	}
	public void addFator(String dtp, String dtup, float taxa) {
		// TODO Auto-generated method stub
		
	}
	public float calculaJuros() {
		// TODO Auto-generated method stub
		return 0.388307f;
	}

}
