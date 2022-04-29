
public class StudentDatabase {

	private Student[] student_list;
	
	public StudentDatabase(Student[] student_list) {
		this.student_list = student_list;
	}
	
	public StudentDatabase() {}
	
	public Student[] getStudentList() {
		return student_list;
	} 
	
	public void setStudentList(Student[] student_list) {
		this.student_list = student_list;
	}
	
	public int getStudentNumber() {
		return student_list.length;
	}
	
	public void printStudentListe() {
		System.out.printf(" %-10s %-10s", student_list);
	}
	
}
