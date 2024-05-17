
public abstract class ContBancar implements SumaTotala{

	private String numarCont;
	private float suma;
	
	public ContBancar(String numarCont, float suma) {
		this.setNumarCont(numarCont);
		this.setSuma(suma);
	}

	public String getNumarCont() {
		return numarCont;
	}

	public void setNumarCont(String numarCont) {
		this.numarCont = numarCont;
	}

	public float getSuma() {
		return suma;
	}

	public void setSuma(float suma) {
		this.suma = suma;
	}
	
	
}
