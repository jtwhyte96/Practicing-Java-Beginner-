package practice;
import java.util.Scanner;

public class Students {

	public static void main(String[] args) {
		
		String[] student = new String[5];
		int[] grade = new int[5];
		
		Scanner input = new Scanner(System.in);
		int count = 1;
		
		for (int i = 0; i < student.length; i++) {
			System.out.println("Input the student " + count + " name");
			student[i] = input.next();
			
			System.out.println("Input the student " + count + " grade");
			grade[i] = input.nextInt();
			
			count++;
		}
		
		for (int i = 0; i < student.length; i++) {
			System.out.println(student[i] + " - " + grade[i]);
		}
		
		int sum = 0;
		double average;
		
		for (int i = 0; i < student.length; i++) {
			sum = grade[i] + sum;
		}
		
		average = (double) sum / student.length; 
		System.out.println("Class Average: " + average); 
		
		int max = grade[0];
		String top = student[0];
		
		for (int i = 0; i < grade.length; i++) {
			if (grade[i] > max) {
				max = grade[i];
				top = student[i];
			}
		}
		
		System.out.println("Top student: " + top);
		System.out.println("Top Grade: " + max);
		
		int min = grade[0];
		String low = student[0];
		
		for (int i = 0; i < grade.length; i++) {
			if (grade[i] < min) {
				min = grade[i];
				low = student[i];
			}
		}
		
		System.out.println("Lowest student: " + low);
		System.out.println("Lowest Grade: " + min);
		

		
		
		
	}

}

