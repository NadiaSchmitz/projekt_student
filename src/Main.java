
public class Main {

	public static void main(String[] args) {

		System.out.println(1);
		Student mio = new Student();
		mio.setName("Mio Johns");
		mio.setMatrikelnummer(98);
		
		System.out.printf("%-10s %-10s", "Name", "Matrikelnummer");
		System.out.println();
		System.out.printf("%-10s %-10s", mio.getName(), mio.getMatrikelnummer());
		System.out.println();
		System.out.println();
		
		System.out.println(2);
		Student jo = new Student("Jo Klam", 12);
		
		System.out.printf("%-10s %-10s", "Name", "Matrikelnummer");
		System.out.println();
		System.out.printf("%-10s %-10s", jo.getName(), jo.getMatrikelnummer());
		System.out.println();
		System.out.println();
		
		System.out.println(3);
		Student lin = new Student();
		System.out.printf("%-10s %-10s", "Name", "Matrikelnummer");
		System.out.println();
		lin.printMe("Lin Kler", 65);
		System.out.println();

		System.out.println(4);
		Student[] list = new Student[1000];
		int i;
		
		System.out.printf("%-10s %-10s", "Name", "Matrikelnummer");
		System.out.println();
		
		for (i = 0; i < 100; i++) {
			list[i] = new Student();
			list[i].setName("Student" + i);
			list[i].setMatrikelnummer(i + 15);
			
			list[i].printMe(list[i].getName(), list[i].getMatrikelnummer());
		}
		
		System.out.println();
		
		System.out.println(5);
		StudentDatabase my_database = new StudentDatabase();
		
	}

}
