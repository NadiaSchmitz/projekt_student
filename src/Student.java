
public class Student {

	private String name;
	private int matrikelnummer;
	private int age;
	private int mark;
	
	public Student(String name, int matrikelnummer, int age, int mark) {
		this.name = name;
		this.matrikelnummer = matrikelnummer;
		this.age = age;
		this.mark = mark;
	}
	
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
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getMark() {
		return mark;
	}
	
	public void setMark(int mark) {
		this.mark = mark;
	}
	
	public void printMe(String name, int matrikelnummer, int age, int mark) {
		System.out.printf("%-15s %-10s %-10s %-10s", name, matrikelnummer, age, mark);
		System.out.println();
	}
	
	public void printMe(String name, int matrikelnummer) {
		System.out.printf("%-15s %-10s", name, matrikelnummer);
		System.out.println();
	}
	
	public void printMe() {
		System.out.printf("%-15s %-10s", name, matrikelnummer);
		System.out.println();
	}
	
	public void printMe8() {
		System.out.printf("%-15s %-15s %-15s %-15s", name, matrikelnummer, age, mark);
		System.out.println();
	}
	
}
