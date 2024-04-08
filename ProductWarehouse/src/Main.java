
public class Main {

	public static void main(String[] args) {
	Warehouse warehouse = new Warehouse();

    Product product1 = new Compensated("1", "Product 1", 70.0, 10, 0.3);
    Product product2 = new Uncompensated("2", "Product 2", 100.0, 20);

    warehouse.addProduct(product1);
    warehouse.addProduct(product2);

    warehouse.printInventory();

	}

}
