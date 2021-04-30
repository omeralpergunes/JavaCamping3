package kamp3day;

public class StudentManager extends UserManager{

	public void wiewFirstName(Student student) {
		System.out.println("Bir Öğrencinin Adı" + student.getFirstName());
	}
}
