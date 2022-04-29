
public class Student {

	private String name;
	private int matrikelnummer;
	
	public Student(String name, int matrikelnummer) {
		this.name = name;
		this.matrikelnummer = matrikelnummer;
	}
	
	public Student() {}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getMatrikelnummer() {
		return matrikelnummer;
	}
	
	public void setMatrikelnummer(int matrikelnummer) {
		this.matrikelnummer = matrikelnummer;
	}
	
	public void printMe(String name, int matrikelnummer) {
		System.out.printf("%-10s %-10s", name, matrikelnummer);
		System.out.println();
	}
	
	public void printMe() {
		System.out.printf("%-10s %-10s", name, matrikelnummer);
		System.out.println();
	}
	
}
