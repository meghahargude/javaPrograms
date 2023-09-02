package abc;
import java.util.Scanner;

public class VolumeofCylinder {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Scanner=new Scanner(System.in);

		System.out.println("enter the radius of the cylinder:");

		double radius=	Scanner.nextDouble();

		System.out.println("enter the height of cylinder:");

		double height=	Scanner.nextDouble();

		double volume = Math.PI*Math.pow(radius,2)*height;

		System.out.println("the volume of cylinder is :"+ volume);

		Scanner.close();
	}


}
