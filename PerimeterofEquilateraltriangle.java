package abc;
import java.util.Scanner;

public class PerimeterofEquilateraltriangle {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Scanner = new Scanner(System.in);
		System.out.println("enter the lenght of a side of the equilateral triangle :");
		double side=Scanner.nextDouble();

		double perimeter=3 * side;
		System.out.println("The peremeter of the equilateral triangle with side lenght"+ side +  "is"  + perimeter);
		Scanner.close();
	}


}
