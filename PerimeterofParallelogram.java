package abc;
import java.util.Scanner;

public class PerimeterofParallelogram {
	public static void main(String[] args) {
	 	// TODO Auto-generated method stub
		Scanner Scanner=new Scanner(System.in);
		System.out.println("enter side1=Scanner.nextDoubl the lenght of one adjecent side of the parallelogram:");
		double side1=Scanner.nextDouble();
		System.out.println("wnterb the lenght of the other adjecent side of the parallelogram:");
		double side2=Scanner.nextDouble();
		double parimeter = 2 * (side1 + side2);
		System.out.println("the parimeter of the parallelogramwith adjacent side"+ side1 + "and"+ side2 +"is" + parimeter);
		Scanner.close();
	}

}
