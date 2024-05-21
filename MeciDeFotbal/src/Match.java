
public class Match {

	public static void main(String[] args) {

		
		Field f1 = new Field(100, 50, "Santiago Bernabeu");
		Ball b1 = new Ball(50, 25, f1);
		Game j1 = new Game("Real Madrid", "Barcelona", 10000, b1);
		
		j1.simuleaza();
		j1.results();
	}

}