package abc;
import java.util.Scanner;

public class AreaofRhombus {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Scanner = new Scanner(System.in);
		System.out.println("enter the lenght of the first diagonal of the rhombus:");
		double diagonal1=Scanner.nextDouble();
		double diagona2=Scanner.nextDouble();
		double area= (diagonal1*diagona2)/2;
		System.out.println("The area of the rhombus with diagonal"+ diagonal1 +"and "+ diagona2 +"is" + area);
		Scanner.close();
	}

}
