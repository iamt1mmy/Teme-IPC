import java.util.ArrayList;

public class Client {

	private String nume, adresa;
	private ArrayList<ContBancar> conturi;
	private final int maxConturiBancare = 5;
	
	public Client(String nume, String adresa, ContBancar c1, ContBancar c2, ContBancar c3, ContBancar c4, ContBancar c5) {
		this.setNume(nume);
		this.setAdresa(adresa);
		this.conturi = new ArrayList<ContBancar>(maxConturiBancare);
		this.conturi.add(c1);
		this.conturi.add(c2);
		this.conturi.add(c3);
		this.conturi.add(c4);
		this.conturi.add(c5);
	}
	
	public Client(String nume, String adresa, ContBancar c1, ContBancar c2, ContBancar c3, ContBancar c4) {
		this.setNume(nume);
		this.setAdresa(adresa);
		this.conturi = new ArrayList<ContBancar>(maxConturiBancare);
		this.conturi.add(c1);
		this.conturi.add(c2);
		this.conturi.add(c3);
		this.conturi.add(c4);
	}
	
	public Client(String nume, String adresa, ContBancar c1, ContBancar c2, ContBancar c3) {
		this.setNume(nume);
		this.setAdresa(adresa);
		this.conturi = new ArrayList<ContBancar>(maxConturiBancare);
		this.conturi.add(c1);
		this.conturi.add(c2);
		this.conturi.add(c3);
	}
	
	public Client(String nume, String adresa, ContBancar c1, ContBancar c2) {
		this.setNume(nume);
		this.setAdresa(adresa);
		this.conturi = new ArrayList<ContBancar>(maxConturiBancare);
		this.conturi.add(c1);
		this.conturi.add(c2);
	}
	
	public Client(String nume, String adresa, ContBancar c1) {
		this.setNume(nume);
		this.setAdresa(adresa);
		this.conturi = new ArrayList<ContBancar>(maxConturiBancare);
		this.conturi.add(c1);
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public String getAdresa() {
		return adresa;
	}

	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}
	
	public ArrayList<ContBancar> getConturi() {
		return conturi;
	}
	
	public void setConturi(ArrayList<ContBancar> conturi) {
		this.conturi = conturi;
	}
	
	public boolean addContBancar(ContBancar c) {
		if(conturi.size()<maxConturiBancare)
		{
			conturi.add(c);
			return true;
		}
		return false;
	}
}
