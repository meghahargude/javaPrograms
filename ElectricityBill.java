package abc;
import java.util.Scanner;

public class ElectricityBill {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Scanner=new Scanner(System.in);

		System.out.println("enter the unit consumed:");

		double unitconsumed=	Scanner.nextDouble();

		System.out.println("enter the rate per unit:");

		double rateperunit=	Scanner.nextDouble();

		double heigth=	Scanner.nextDouble();

		double billamount = unitconsumed * rateperunit;

		System.out.println("electricity bill :"+ billamount);

		Scanner.close();
	}



}
