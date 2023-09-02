package abc;
import java.util.Scanner;

public class VolumeofPrism {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Scanner=new Scanner(System.in);

		System.out.println("enter the lenght of the base:");

		double lenght= Scanner.nextDouble();

		System.out.println("enter the width of base:");

		double width= Scanner.nextDouble();

		System.out.println("enter the height of the prism:");

		double height= Scanner.nextDouble();

		double volume = lenght*width*height;

		System.out.println("the volume of prism is :"+ volume);

		 Scanner.close();
	}

}


