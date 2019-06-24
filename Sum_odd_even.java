package sarath;

import java.util.Scanner;

public class Sum_odd_even {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the two numbers:");
		int a=s.nextInt();
		int b=s.nextInt();
		int c=a+b;
	if(c%2==0)
		System.out.println("The number is even");
	else
		System.out.println("The number is odd");
	s.close();
		

	}

}
