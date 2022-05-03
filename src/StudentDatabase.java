
public class StudentDatabase {

	private Student[] students_list;
	private int records_number;
	
	// Constructors
	public StudentDatabase(Student[] students_list, int records_number) {
		this.students_list = students_list;
		this.records_number = records_number;
	}
	
	public StudentDatabase() {}
	
	// Getter, Setter
	public Student[] getStudentsList() {
		return students_list;
	} 
	
	public void setStudentsList(Student[] students_list) {
		this.students_list = students_list;
	}
	
	public int getRecordsNumber() {
		return records_number;
	}
	
	public void setRecordsNumber(int records_number) {
		this.records_number = records_number;
	}
	
	// Methoden
	public void printStudentsListe(Student[] students_list) {
		for (int i = 0; i < students_list.length; i++) {
			System.out.printf(" %-20s %-15s", students_list[i].getName(), students_list[i].getMatrikelnummer());
			System.out.println();
		}
	}
	
	public void addStudent(String new_name) {
		int max_matrikelnumber = 0;
		int max_matrikelnumber_index = 0;
		for (int i = 0; i < students_list.length; i++) {
			if (students_list[i].getMatrikelnummer() > max_matrikelnumber) {
				max_matrikelnumber = students_list[i].getMatrikelnummer();
				max_matrikelnumber_index = i;
			}
			
			if (max_matrikelnumber_index == students_list.length - 1) {
				System.out.println("Es kann keinen neuen Student gespeichert werden.");
			}
		}
		
		students_list[max_matrikelnumber_index + 1].setName(new_name);
		students_list[max_matrikelnumber_index + 1].setMatrikelnummer(max_matrikelnumber_index + 2);
	}
	
	public void deleteStudent(int matrikelnumber) {
		boolean check = false;
		int i = 0;
		while (i < students_list.length) {
			if (matrikelnumber == i + 1) {
				check = true;
				break;
			}
			i++;
		}
		
		if (check) {
			students_list[matrikelnumber - 1].setName("-");
			students_list[matrikelnumber - 1].setMatrikelnummer(0);
		} else {
			System.out.println("Es gibt keinen Student mit Matrikelnummer " + matrikelnumber);
		}
		
	}
	
	public int numberOfStudents() {
		int students_number = 0;
		for (int i = 0; i < students_list.length; i++) {
			if (students_list[i].getMatrikelnummer() > 0) {
				students_number++;
			}
		}
		return students_number;
	}
	
	public void statistikAge() {
		int sum = 0;
		int number = 0;
		double avg = 0;
		
		for (int i = 0; i < students_list.length; i++) {
			if (students_list[i].getMatrikelnummer() > 0) {
				sum = sum + students_list[i].getAge();
				number++;
			}
		} 
		avg = sum / number;
		System.out.println("Durchschnittlicher Alter: " + avg);
	}
	
	public void statistikMark() {
		int sum = 0;
		int number = 0;
		double avg = 0;
		
		for (int i = 0; i < students_list.length; i++) {
			if (students_list[i].getMatrikelnummer() > 0) {
				sum = sum + students_list[i].getMark();
				number++;
			}
		} 
		avg = sum / number;
		System.out.println("Durchschnittliche Note: " + avg);
	}
	
}
