package CadernoFormulasSelic;

public class LTN {
	
	private float tInd;
	
	public LTN(float tInd){
		this.tInd = tInd;
	}
	
	public float getPrecoUnitario(){
		return (float) (1000/(Math.pow((float)(1+tInd),(float)1/252)));
	}

}
