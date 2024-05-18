import java.util.ArrayList;

public class InvestmentCompany {

	private static ArrayList<Project> projects = new ArrayList<Project>();
	
	public static void addProject(Project p) {
		projects.add(p);
	}
	
	public static Project getBestInvestment() {
		double bestRisk = projects.get(0).getRisk();
		String nameOfBestInvestment = projects.get(0).getTitle();
		Project project = projects.get(0);
		for (Project p : projects) {
			if (p.getRisk() < bestRisk) {
				bestRisk = p.getRisk();
				nameOfBestInvestment = p.getTitle();
				project = p;
			}
		}
		System.out.println("The best project to invest in is " + nameOfBestInvestment);
		return project;
	}
	
	
	public static void main(String[] args) {

		Member m1 = new Member(17, "Abi");
		Member m2 = new Member(15, "Teo");
		Member m3 = new Member(12, "Tom");
		Member m4 = new Member(20, "Timmy");

		Project p1 = new Comercial("Lucian", 45, "Grafica", "Totul pe placul clientului", 6547, "19/11/2024");
		p1.addMember(m1);
		p1.addMember(m3);

		Project p2 = new Militare("Claudia", 45, "Asistenta", "Cele mai bune ingrijiri", 2346, "05/07/2024", "qwertyuiop!5T");
		p2.addMember(m4);
		p2.addMember(m2);
		
		Project p3 = new OpenSource("Beni", 21, "Fotbal", "Visca Barca", 9874, "beni@fotbal.ro");
		p3.addMember(m1);
		p3.addMember(m2);
		p3.addMember(m3);
		p3.addMember(m4);
		
		addProject(p1);
		addProject(p2);
		addProject(p3);

		getBestInvestment();
	}

}