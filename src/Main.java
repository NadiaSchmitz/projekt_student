
public class Main {

	public static void main(String[] args) {

		// Aufgabe 1
		System.out.println("Aufgabe 1");
		System.out.println("--------------------------");
		
		Student mio = new Student();
		mio.setName("Mio Johns");
		mio.setMatrikelnummer(98);
		
		System.out.printf("%-15s %-10s", "Name", "Matrikelnummer");
		System.out.println();
		System.out.printf("%-15s %-10s", mio.getName(), mio.getMatrikelnummer());
		System.out.println();
		System.out.println();
		
		// Aufgabe 2
		System.out.println("Aufgabe 2");
		System.out.println("--------------------------");
		
		Student jo = new Student("Jo Klam", 12);
		
		System.out.printf("%-15s %-10s", "Name", "Matrikelnummer");
		System.out.println();
		System.out.printf("%-15s %-10s", jo.getName(), jo.getMatrikelnummer());
		System.out.println();
		System.out.println();
		
		// Aufgabe 3
		System.out.println("Aufgabe 3");
		System.out.println("--------------------------");
		
		Student lin = new Student();
		System.out.printf("%-15s %-10s", "Name", "Matrikelnummer");
		System.out.println();
		lin.printMe("Lin Kler", 65);
		System.out.println();

		// Aufgabe 4
		System.out.println("Aufgabe 4");
		System.out.println("--------------------------");
		
		Student[] list = new Student[40];
		int i;
		
		System.out.printf("%-15s %-10s", "Name", "Matrikelnummer");
		System.out.println();
		
		for (i = 0; i < list.length; i++) {
			list[i] = new Student();
			list[i].setName("Student" + (i + 1));
			list[i].setMatrikelnummer(i + 1);
			list[i].printMe(list[i].getName(), list[i].getMatrikelnummer());
			if (i >= 30) {
				list[i].setName("-");
				list[i].setMatrikelnummer(0);
			}
		}
		
		System.out.println();
		
		// Aufgabe 5
		System.out.println("Aufgabe 5");
		System.out.println("--------------------------");
		
		StudentDatabase my_database = new StudentDatabase();
		my_database.setRecordsNumber(40);
		Student[] students_list = new Student[my_database.getRecordsNumber()];
		
		for (i = 0; i < students_list.length; i++) {
			students_list[i] = new Student();
			students_list[i].setName("Student_new" + (i + 1));
			students_list[i].setMatrikelnummer(i + 1);
			
			if (i >= my_database.getRecordsNumber() / 2) {
				students_list[i].setName("-");
				students_list[i].setMatrikelnummer(0);
			}
		}
		
		my_database.setStudentsList(students_list);
		
		// Databank ausgeben
		System.out.println("Datenbank aus Klasse StudenDatabase");
		System.out.printf("%-15s %-10s", "Name", "Matrikelnummer");
		System.out.println();
		
		for (i = 0; i < my_database.getStudentsList().length; i++) {
			my_database.getStudentsList()[i].printMe(my_database.getStudentsList()[i].getName(), my_database.getStudentsList()[i].getMatrikelnummer());
		}
		
		System.out.println();
		
		// Einen neuen Student eitragen
		my_database.addStudent("Nadia");
		my_database.addStudent("Michael");
		
		System.out.println("Datenbank aus Klasse StudenDatabase + neue Studenten");
		System.out.printf("%-15s %-10s", "Name", "Matrikelnummer");
		System.out.println();
		
		for (i = 0; i < my_database.getStudentsList().length; i++) {
			my_database.getStudentsList()[i].printMe(my_database.getStudentsList()[i].getName(), my_database.getStudentsList()[i].getMatrikelnummer());
		}
		
		System.out.println();
		
		// Aufgabe 6
		System.out.println("Aufgabe 6");
		System.out.println("--------------------------");
		
		my_database.deleteStudent(10);
		System.out.println();
		
		System.out.println("Datenbank aus Klasse StudenDatabase + neue Studenten - gelöschte Studenten");
		System.out.printf("%-15s %-10s", "Name", "Matrikelnummer");
		System.out.println();
		
		for (i = 0; i < my_database.getStudentsList().length; i++) {
			my_database.getStudentsList()[i].printMe(my_database.getStudentsList()[i].getName(), my_database.getStudentsList()[i].getMatrikelnummer());
		}
		
		System.out.println();
		
		// Aufgabe 7
		System.out.println("Aufgabe 7");
		System.out.println("--------------------------");
		
		System.out.println("Anzahl der Studenten: " + my_database.numberOfStudents());
		System.out.println();
		
		// Aufgabe 8
		System.out.println("Aufgabe 8");
		System.out.println("--------------------------");
		
		for (i = 0; i < students_list.length; i++) {
			if (students_list[i].getMatrikelnummer() > 0) {
				my_database.getStudentsList()[i].setAge((int)(Math.round(Math.random() * 10) + 20));
				my_database.getStudentsList()[i].setMark((int)(Math.round(Math.random() * 6)));
			}
		}
		
		System.out.println("Datenbank aus Klasse StudenDatabase + neue Studenten - gelöschte Studenten");
		System.out.printf("%-15s %-10s", "Name", "Matrikelnummer");
		System.out.println();
		
		for (i = 0; i < my_database.getStudentsList().length; i++) {
			my_database.getStudentsList()[i].printMe(my_database.getStudentsList()[i].getName(), my_database.getStudentsList()[i].getMatrikelnummer(), my_database.getStudentsList()[i].getAge(), my_database.getStudentsList()[i].getMark());
		}
		
		my_database.statistikAge();
		my_database.statistikMark();
		
	}

}
