package sarath;

import java.util.Scanner;

public class Watermelon {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the weight:");
		int n=s.nextInt();
		int a;int c;
		if(0>n&&n<=100||(n%2!=0))
			System.out.println("Invalid input");
		if(n%2==0)
		{
			System.out.println("YES");
			int b=n/2;
			if(b%2==0)
			{
			System.out.println(b+" "+b);
			}
		else if(b>0)
		{
			
			 b=n/2;
			 a=b-1;
			 c=b+1;
			 System.out.println(a+" "+c);
			
		}
		else
			System.out.println("NO");
			
		s.close();
	}
	}
	}
