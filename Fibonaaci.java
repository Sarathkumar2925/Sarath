package sarath;

import java.util.Scanner;

public class Fibonaaci {

	public static void main(String[] args) 
	{  
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of terms:");
		int n=s.nextInt();int sum=0;
		int a=0;int b=1;
		System.out.print(a+" " + b);
			for(int i=0;i<n;i++)
			{
				sum=a+b;
				System.out.print(" "+ sum );
				a=b;
				b=sum;
				
			}
			
			
		s.close();
		
	}
}
