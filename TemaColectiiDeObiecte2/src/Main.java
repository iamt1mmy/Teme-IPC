
public class Main {
    public static void testCosCumparaturi() {
        CosCumparaturi cos = new CosCumparaturi();
        cos.adaugaProdus(new Produs("Apple", 1.2));
        cos.adaugaProdus(new Produs("Banana", 0.8));
        System.out.println("Total price: " + cos.calculeazaTotal());
    }

    public static void main(String[] args) {
        testCosCumparaturi();
    }
}