package abc;
import java.util.Scanner;
public class Leapyear {
	public static void main(String[]args) {
		long y; 
		try(Scanner sc=new Scanner(System.in)){
		System.out.println("enter any calendar year :");
		y=sc.nextLong();
		if(y%4==0)
			System.out.println(y+"is a leap year");
		else
			System.out.println(y+"is not a leap year");
		}
	}

}
