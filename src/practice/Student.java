package practice;

public class Student {
	
	private String name;
	private double grade;
	private static int studentCount = 0;
	
	public Student (String name, double grade) {
		this.name = name;
		setGrade(grade);
		setStudentCount(getStudentCount() + 1);
	}
	
	public String getName() {
		return name;
	}
	
	public double getGrade() {
		return grade;
	}
	
	public void setGrade(double grade) {
		if (grade < 0 || grade > 100) {
			System.out.println("Invalid Grade!");
		} else {
			this.grade = grade;
		}
	}

	public static int getStudentCount() {
		return studentCount;
	}

	public static void setStudentCount(int studentCount) {
		Student.studentCount = studentCount;
	}
	
}

