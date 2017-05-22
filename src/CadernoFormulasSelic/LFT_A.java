package CadernoFormulasSelic;

public class LFT_A {
	
	private float VE;
	private float c;
	private float Tac = 0.0245f;
	private int Du;
	private int Dut;
	private int p;
	private int n;
	
	public LFT_A(float _ve, float _c, int _du, int _dut, int _p, int _n) {
		this.VE = _ve;
		this.c = _c;
		this.Du = _du;
		this.Dut = _dut;
		this.p = _p;
		this.n = _n;
	}
	
	public float getVNa(){
		return (float) (c * VE * (Math.pow((float)1 + Tac/100, (float)Du/Dut))) 
				- (float)((c * VE * Math.pow((float)1 + Tac, (float)Du/Dut)) 
						* (float) 1/(p - n));
	}

}
