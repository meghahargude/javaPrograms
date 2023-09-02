package abc;
import java.util.Scanner;

public class VolumeofSphere {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Scanner=new Scanner(System.in);

		System.out.println("enter the radius of the sphere:");

		double radius=Scanner.nextDouble();

		double volume = (4.0/3.0)*Math.PI*Math.pow(radius,3);

		System.out.println("the volume of sphere is :"+ volume);

		Scanner.close();
	}


}
