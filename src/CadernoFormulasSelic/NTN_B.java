package CadernoFormulasSelic;

public class NTN_B {
	
	private float IPCAt;
	private float IPCAt0;
	private float IPCAt1;
	private float VN;
	
	private int dc;
	private int dct;
	
	public NTN_B(float iPCAt, float iPCAt0, float iPCAt1, float vN, int dc, int dct) {
		this.IPCAt = iPCAt;
		this.IPCAt0 = iPCAt0;
		this.IPCAt1 = iPCAt1;
		this.VN = vN;
		this.dc = dc;
		this.dct = dct;
	}
	
	public float getVNA(){
		
		return calculaFator() * (float) (IPCAt/IPCAt0) * VN;
		
	}

	private float calculaFator() {
		return (float) Math.pow((float)IPCAt1/IPCAt0, (float)dc/dct);
	}

}
