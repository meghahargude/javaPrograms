package abc;
import java.util.Scanner;

public class DiscountProduct {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Scanner=new Scanner(System.in);

		System.out.println("enter the original price:");

		double price=Scanner.nextDouble();

		System.out.println("enter the discount percentage:");

		double discount=	Scanner.nextDouble();

	

		double discountprice = price-discount;

		System.out.println("discount price :$"+ discount);
		System.out.println("Amount save:$"+discountprice);

		Scanner.close();
	}


}
