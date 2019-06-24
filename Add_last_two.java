package sarath;

import java.util.Scanner;

public class Add_last_two {
public static void main(String[] args) {
	int sum=0,r=0,t=0;
	Scanner s=new Scanner(System.in);
	for(int i=1;i<=1;i++)
	{
		System.out.println("Enter the first number:");
			int a=s.nextInt();	
			 r=a%10;
		System.out.println("enter the second number:");
		 int b=s.nextInt();
		  t=b%10;
	}
	 sum=t+r;
	System.out.println("The sum of the last two digits is"+sum);
	s.close();
	 
	
}
}
