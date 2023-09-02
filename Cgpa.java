package abc;
import java.util.Scanner;

public class Cgpa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();
        
        double totalGradePoints = 0.0;
        double totalCredits = 0.0;
        
        for (int i = 1; i <= numSubjects; i++) {
            System.out.println("Enter details for Subject " + i + ":");
            
            System.out.print("Enter credits for Subject " + i + ": ");
            int credits = scanner.nextInt();
            
            System.out.print("Enter grade points (out of 10) for Subject " + i + ": ");
            double gradePoints = scanner.nextDouble();
            
         
            totalGradePoints += (credits * gradePoints);
            totalCredits += credits;
        }
        
       
        double cgpa = totalGradePoints / totalCredits;
        
        System.out.println("Your CGPA is: " + cgpa);
        
        scanner.close();
    }






	}


