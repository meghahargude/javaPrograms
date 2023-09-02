package abc;
import java.util.Scanner;

public class PerimeterofRectangle {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Scanner=new Scanner(System.in);
		System.out.println("enter the lenght of rectangle:");
		double lenght=Scanner.nextDouble();
		System.out.println("enter the width of rectangle:");
		double width=Scanner.nextDouble();
		double parimeter = 2 * (lenght + width);
		System.out.println("the parimeter of the parallelogram with adjacent side"+ parimeter);
		Scanner.close();
	}

}
