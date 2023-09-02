package abc;
import java.util.Scanner;

public class AreaOfRectangle {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Scanner = new Scanner(System.in);
		System.out.println("enter the radius of Rectangle:");
		double length=Scanner.nextDouble();
		double width=Scanner.nextDouble();
		double area= length*width;
		System.out.println("The area of the rectangle with lenght"+ length +"and width"+ width +"is" + area);
		Scanner.close();
	}

}


