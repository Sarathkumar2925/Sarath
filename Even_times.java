package sarath;

import java.util.Scanner;

public class Even_times {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the array size:");
	    int n=s.nextInt();
	    int a[]=new int[n];//int a[]=new int[4];
		int count=0;
		int count1=0;
		System.out.println("\n Enter the numbers:");
			 for(int i=0;i<n;i++)
			 {
				 a[i]=s.nextInt();		
			 }
		
			 for(int i=0;i<n;i++)
		{
			if(a[i]%2==0)
				
				count++;
				
		}
		System.out.println("There are" + count + "even numbers.");

		for(int i=0;i<n;i++)
		{
			if(a[i]%2!=0)
				count1++;
		}
		System.out.println("There are" + count1 + "odd numbers.");
		
		s.close();
	}
}
