
public class Birou {
	private int l, L, H;
	private Sertar sertar1, sertar2;
	public Birou(int l, int l2, int h, Sertar sertar1, Sertar sertar2) {
		this.l = l;
		L = l2;
		H = h;
		this.sertar1 = sertar1;
		this.sertar2 = sertar2;
	}
	
	public void tiparesteBirou() {
		System.out.println("Birou: " + l + " " + L+ " " + H);
		sertar1.tiparesteSertar();
		sertar2.tiparesteSertar();
	}
}
