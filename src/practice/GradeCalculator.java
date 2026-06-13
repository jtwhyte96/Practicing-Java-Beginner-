package practice;
import java.util.Scanner;

public class GradeCalculator {
	
	public static String gradeCalc(double score) {
		
		if (score < 0 || score > 100) {
		    return "invalid score";
		} else if (score >= 90) {
		    return "A";
		} else if (score >= 80) {
		    return "B";
		} else if (score >= 70) {
		    return "C";
		} else if (score >= 60) {
		   return "D";
		} else {
		   return "F";
		}
		
		
	}

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String grade;
		double score;
		String name;
		String replay;
		
		do {
			System.out.println("Enter student's name");
			name = input.nextLine();
			
			System.out.println("Enter score");
			score = input.nextDouble();
			
			grade  = gradeCalc(score);
			System.out.println( name + "'s grade is: " + grade);
			
			System.out.println("Would you like to grade another student? (Y/N)");
			replay = input.next();
			
		} while (replay.equalsIgnoreCase("Y"));
		
		input.close();
		
		
		
		
		
		
		

	}

}
