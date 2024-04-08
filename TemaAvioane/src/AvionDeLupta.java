
public class AvionDeLupta extends Avion {

	public AvionDeLupta(String planeID, int totalEnginePower) {
		super(planeID, totalEnginePower);
	}
	
	public void launchMissile() {
		System.out.println(getPlaneID()+" Initiating missile launch procedure");
		System.out.println("Acquiring target");
		System.out.println("Launching missile");
		System.out.println("Break-ing away");
		System.out.println("Missile launch complete\n");
	}

}
