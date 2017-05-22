package CadernoFormulasSelic;

public class NTN_B {
	
	private float IPCAt;
	private float IPCAt0;
	private float IPCAt1;
	private float VN;
	
	private int dc;
	private int dct;
	
	float VNA_juros;
	float i_juros;
	int n_juros;
	int dcp_juros;
	int dct_juros;
	
	public NTN_B(float iPCAt, float iPCAt0, float iPCAt1, float vN, int dc, int dct, 
				float vna, float i_juros, int n_juros, int dcp_juros, int dct_juros) {
		this.IPCAt = iPCAt;
		this.IPCAt0 = iPCAt0;
		this.IPCAt1 = iPCAt1;
		this.VN = vN;
		this.dc = dc;
		this.dct = dct;
		
		this.VNA_juros = vna;
		this.i_juros = i_juros;
		this.n_juros = n_juros;
		this.dcp_juros = dcp_juros;
		this.dct_juros = dct_juros;
	}
	
	public float getVNA(){
		
		return calculaFator() * (float) (IPCAt/IPCAt0) * VN;
		
	}

	private float calculaFator() {
		return (float) Math.pow((float)IPCAt1/IPCAt0, (float)dc/dct);
	}
	
	public float getJuros(){
		System.out.println(calculaFatorJuros());
		return VNA_juros * (calculaFatorJuros() - 1);
	}
	
	public float calculaFatorJuros(){
		return (float) Math.pow(
				(float) Math.pow((float) (i_juros/100 + 1), (float)n_juros/12), 
								(float) dcp_juros/dct_juros);
	}

}
