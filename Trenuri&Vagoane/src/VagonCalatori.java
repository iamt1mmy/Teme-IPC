
public abstract class VagonCalatori extends Vagon {

	private int pasageri;

	public VagonCalatori(int coletePostale,int pasageri) {
		super(coletePostale);
		this.pasageri = pasageri;
	}
	
	public int getPasageri() {
		return pasageri;
	}

	public void deschideUsile() {
		System.out.println("Usi deschise automat");
	}
	
	public void inchideUsile() {
		System.out.println("Usi inchise automat");
	}
}
