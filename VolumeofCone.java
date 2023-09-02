package abc;
import java.util.Scanner;

public class VolumeofCone {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Scanner=new Scanner(System.in);

		System.out.println("enter the radius of the cone:");

		double radius= Scanner.nextDouble();

		System.out.println("enter the height of cone:");

		double height= Scanner.nextDouble();

		double volume = (1.0/3.0)*Math.PI*Math.pow(radius,2)*height;

		System.out.println("the volume of cone is :"+ volume);

		 Scanner.close();
	}

}


