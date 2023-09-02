package abc;
import java.util.Scanner;

public class AreaofEquilateraltringle {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Scanner = new Scanner(System.in);
		System.out.println("enter the lenght of side of the wquilateral triangle:");
		double side=Scanner.nextDouble();

		double area= (Math.sqrt(3)/4)*Math.pow(side,2);
		System.out.println("The area of the equilateral triangle with side lenght"+ side +"is" + area);
		Scanner.close();
	}


}
