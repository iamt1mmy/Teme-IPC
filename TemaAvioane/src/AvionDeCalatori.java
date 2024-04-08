
public class AvionDeCalatori extends Avion {

	private int maxPassengers;

	public AvionDeCalatori(String planeID, int totalEnginePower, int maxPassengers) {
		super(planeID, totalEnginePower);
		this.maxPassengers = maxPassengers;
	}

	public int getMaxPassengers() {
		return maxPassengers;
	}

}
