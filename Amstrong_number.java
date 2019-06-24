package sarath;

import java.util.Scanner;

public class Amstrong_number {

	public static void main(String[] args) {
		System.out.println("Enter the number:");
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int r=0,m=0;
		int b=a,x=a;
		int count=0,sum=0;
		while(a>0)
		{
			r=a%10;
			count++;
			a=a/10;
		}
		while(b>0)
		{
			m=b%10;
			int p=(int) Math.pow(m,count);
			b=b/10;
			sum=sum+p;
			
		}
		if(sum==x)
		{
			System.out.println("Amstrong number");
		}
		else
		{
			System.out.println("Not an amstrong number");
		}
		s.close();
	}
}
