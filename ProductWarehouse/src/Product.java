
public class Product {

	private String cod;
	private String name;
	public double basePrice;
    private int quantity;
	
    public Product(String cod, String name, double basePrice, int quantity) {
		this.cod = cod;
		this.name = name;
		this.basePrice = basePrice;
		this.quantity = quantity;
	}

	public String getCod() {
		return cod;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return basePrice;
	}

	public int getQuantity() {
		return quantity;
	}
	
	public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
	
    
}
