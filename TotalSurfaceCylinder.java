package abc;
import java.util.Scanner;

public class TotalSurfaceCylinder {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Scanner=new Scanner(System.in);

		System.out.println("enter the radius of the cylinder:");

		double radius=Scanner .nextDouble();

		System.out.println("enter the height of cylinder:");

		double height=Scanner .nextDouble();

		double curvedsurfacearea=2 * Math.PI*radius * height;

		double  basesurfacearea = 2*Math.PI*Math.pow(radius,2);

		double totalsurfacearea=curvedsurfacearea + basesurfacearea;

		System.out.println("the total surface area of cylinder is :"+ totalsurfacearea);

		Scanner .close();
	}

}


