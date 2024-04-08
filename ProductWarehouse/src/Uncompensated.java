
public class Uncompensated extends Product {

	public Uncompensated(String cod, String name, double basePrice, int quantity) {
		super(cod, name, basePrice, quantity);
	}
	
	public double getPrice() {
        return basePrice;
    }
}
