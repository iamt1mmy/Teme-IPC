import java.util.ArrayList;
import java.util.List;

public class Warehouse {
	
    private List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        for (Product existingProduct : products) {
            if (existingProduct.getCod().equals(product.getCod())) {
                existingProduct.setQuantity(existingProduct.getQuantity() + product.getQuantity());
                return;
            }
        }
        products.add(product);
    }

    public void printInventory() {
        for (Product product : products) {
            System.out.println("Cod: " + product.getCod() + ", Nume: " + product.getName() + ", Pret: " + product.getPrice() + ", Cantitate: " + product.getQuantity());
        }
    }
}

