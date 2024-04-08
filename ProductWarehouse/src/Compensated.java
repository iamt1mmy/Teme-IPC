
public class Compensated extends Product {

	private double coefficient;

	public Compensated(String cod, String name, double basePrice, int quantity, double coefficient) {
		super(cod, name, basePrice, quantity);
		this.coefficient = coefficient;
	}
	
	public double getPrice() {
        return basePrice * coefficient;
    }
}
