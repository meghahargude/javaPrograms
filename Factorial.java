package abc;
import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Scanner=new Scanner(System.in);

		System.out.println("enter the non-negative integer:");

		int number=Scanner .nextInt();

		if(number<0){
		System.out.println("factorial is undifine for negative numbers:");
		}else{
		    long factorial=1;
		    for(int i=1;i<=number;i++){
		        factorial*=1;
		    }
		System.out.println("the factorial of:"+ number +"is" + factorial);
		}
		Scanner .close();
	}

}


