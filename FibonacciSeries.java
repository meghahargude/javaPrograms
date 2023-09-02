package abc;
import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Scanner=new Scanner(System.in);

		System.out.println("enter the number of term of the fibonacci series:");

		int n=Scanner.nextInt();

		int firstterm =0, secondterm=1;

		System.out.println("fibponacci series:");

		System.out.println(firstterm +""+ secondterm +"");

		for(int i=2;i<n;i++){
		    int nextterm =firstterm + secondterm;

		System.out.println(nextterm +"");

		firstterm = secondterm;
		secondterm = nextterm;
		}
		Scanner.close();
	}


}
