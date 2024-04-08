
public class Main {

	public static void main(String[] args) {
		Sertar sertar = new Sertar(3, 4, 5);
		sertar.tiparesteSertar();
		
		Sertar s1 = new Sertar(8, 3, 2);
		Sertar s2 = new Sertar(2, 7, 4);
		
		Birou birou = new Birou(2, 7, 4, s1, s2);
		birou.tiparesteBirou();
	}

}
