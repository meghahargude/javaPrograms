package abc;
import java.util.Scanner;

public class PerimeterofCircle {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Scanner = new Scanner(System.in);
		System.out.println("enter the radius of the circle:");
		double radius=Scanner.nextDouble();

		double perimeter=2 * Math.PI * radius;
		System.out.println("The peremeter of the circle with radius"+ radius +"is" + perimeter);
		Scanner.close();
	}


}
