package abc;
import java.util.Scanner;

public class AreaofParallelogram {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Scanner = new Scanner(System.in);
		System.out.println("enter the radius of parallelogram:");
		double base=Scanner.nextDouble();
		double height=Scanner.nextDouble();
		double area=  base * height;
		System.out.println("The area of the Isosceles triangle with base"+ base +"and height"+ height +"is" + area);
		Scanner.close();
	}

}


