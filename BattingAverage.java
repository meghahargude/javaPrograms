package abc;
import java.util.Scanner;

public class BattingAverage {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Scanner=new Scanner(System.in);

		System.out.println("enter the total runs stored:");

		double td=Scanner.nextDouble();

		System.out.println("enter the total number of (out):");

		double runs=	Scanner.nextDouble();

	

		double batting = (double)runs/td;

		System.out.println("batting average :"+ batting);
		

		Scanner.close();
	}


}
