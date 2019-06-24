package sarath;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		int n=1;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the number:");
	int a=s.nextInt();
	for(int i=1;i<=a;i++)
	{
	n=n*i;
	}
	System.out.println("The factorial is"+n);
	s.close();
	}
	

}
