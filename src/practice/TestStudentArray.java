package practice;

public class TestStudentArray {

	public static void main(String[] args) {
		
		Student[] students = new Student[3];
		
		students[0] = new Student("Joseph", 100);
		students[1] = new Student("John", 80);
		students[2] = new Student("Felix", 98);
		
		for (int i = 0; i < students.length; i++ ) {
			System.out.println(students[i].getName() + ": "  + students[i].getGrade() );
		}
		

	}

}
