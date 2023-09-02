package abc;
import java.util.Scanner;

public class AreaofIsoscelestriangle {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Scanner = new Scanner(System.in);
		System.out.println("enter the radius of  Isosceles Triangle:");
		double base=Scanner.nextDouble();
		double side=Scanner.nextDouble();
		double area= 0.5 * base * side;
		System.out.println("The area of the Isosceles triangle with base"+ base +"and equal side"+ side +"is" + area);
		Scanner.close();
	}

}


