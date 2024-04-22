import java.util.LinkedList;

public class CosCumparaturi {
    LinkedList<Produs> listaProduse;

    public CosCumparaturi() {
        this.listaProduse = new LinkedList<>();
    }

    public void adaugaProdus(Produs produs) {
        this.listaProduse.add(produs);
    }

    public double calculeazaTotal() {
        double total = 0;
        for (Produs produs : this.listaProduse) {
            total += produs.pret;
        }
        return total;
    }
}