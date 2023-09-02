package abc;
import java.util.Scanner;

public class AreaOfTriangle {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Scanner = new Scanner(System.in);
		System.out.println("enter the radius of Triangle:");
		double base=Scanner.nextDouble();
		double height=Scanner.nextDouble();
		double area= 0.5 * base * height;
		System.out.println("The area of the triangle with base"+ base +"and height"+ height +"is" + area);
		Scanner.close();

}
}
