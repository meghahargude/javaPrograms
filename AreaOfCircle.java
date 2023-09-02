package abc;
import java.util.Scanner;

public class AreaOfCircle {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Scanner = new Scanner(System.in);
		System.out.println("enter the radius of circle:");
		double radius=Scanner.nextDouble();
		double area= Math.PI * Math.pow(radius,2);
		System.out.println("The area of the circle with radius"+radius+"is"+area);
		Scanner.close();

}
}
