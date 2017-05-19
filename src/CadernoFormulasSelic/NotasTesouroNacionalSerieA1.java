package CadernoFormulasSelic;

public class NotasTesouroNacionalSerieA1 {
	
	private float USSA;
	private float USSB;
	private float valorEmissao;
	private float percentualAmortizacao;
	
	
	
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
	
	
	public float calculaPrecoUnitarioAmortizado() {
		return (getUSSA()/getUSSB())*calculaValorLiquido();
	}
	
	public float calculaValorLiquido() {
		return getValorEmissao()*getPercentualAmortizacao();
	}
	public void setPrecoUnitarioAmortizado(float f) {
		// TODO Auto-generated method stub
		
	}
	public void addFator(String dtp, String dtup, float taxa) {
		// TODO Auto-generated method stub
		
	}
	public float calculaJuros() {
		// TODO Auto-generated method stub
		return 0;
	}

}
