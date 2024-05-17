
public class Main {

	public static void main(String[] args) {

		ContBancar cb1 = new ContLei("978456123", 2543);
		ContBancar cb2 = new ContEuro("132456789", 120);
		
		Client c1 = new Client("Timmy", "Bucuresti", cb1, cb2);
		
		Banca b = new Banca("203843");
		
		b.addClient(c1);
		
		b.afisareClient("Timmy");

	}
}
