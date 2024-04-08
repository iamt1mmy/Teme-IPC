public class Main {

	public static void main(String[] args) {

		Avion boeing1 = new Boeing("bg123456",1000,300);
		Avion concorde1 = new Concorde("cc3559",300,50);
		Avion mig1 = new Mig("mg371",2000);
		Avion tomCat1 = new TomCat("tc007",2500);

		Boeing actionBoeing1 = (Boeing)boeing1;
		Concorde actionConcorde1 = (Concorde)concorde1;
		Mig actionMig1 = (Mig)mig1;
		TomCat actionTomCat1 = (TomCat)tomCat1;

		actionBoeing1.takeOff();
		actionBoeing1.fly();
		actionBoeing1.land();
		

		actionConcorde1.takeOff();
		actionConcorde1.fly();
		actionConcorde1.land();
		actionConcorde1.goSuperSonic();
		actionConcorde1.goSubSonic();
		
		actionMig1.takeOff();
		actionMig1.fly();
		actionMig1.land();
		actionMig1.launchMissile();
		actionMig1.highSpeedGeometry();
		actionMig1.normalGeometry();
		
		actionTomCat1.takeOff();
		actionTomCat1.fly();
		actionTomCat1.land();
		actionTomCat1.launchMissile();
		actionTomCat1.refuel();
	}

}