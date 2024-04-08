
public class Concorde extends AvionDeCalatori {

	public Concorde(String planeID, int totalEnginePower, int maxPassengers) {
		super(planeID, totalEnginePower, maxPassengers);
	}

	public void goSuperSonic() {
		System.out.println(getPlaneID()+ " - Supersonic mode activated");
	}
	
	public void goSubSonic() {
		System.out.println(getPlaneID()+ " - Supersonic mode deactivated");
	}
}
