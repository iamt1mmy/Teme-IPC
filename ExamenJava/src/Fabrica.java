import java.util.List;

public abstract interface Fabrica {

	public static final List angajati = null;
	public static final List clienti = null;
	public static final List acte = null;
	
	public default  String adaugareAngajati() {
		return null;
	}
	
	public default  String concediereAngajati() {
		return null;
	}
	
	public default  String afisareAngajatiActivi() {
		return null;
	}
	
	public default  String adaugareClienti() {
		return null;
	}
	
	public default  String generareContract() {
		return null;
	}
	
	public default  String eliberareFluturas() {
		return null;
	}
	
	public default  String afisareaActelorEmise() {
		return null;
	}
}
