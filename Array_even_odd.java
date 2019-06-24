package sarath;

import java.util.Scanner;

public class Array_even_odd {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n=s.nextInt();
		int a[]=new int[n];
		int even,sum=0;
		System.out.println("Enter the members");
		
				for(int i=0;i<n;i++)
				{
					a[i]=s.nextInt();
				}
		
				for(int j=0;j<n;j++)
				{
					if(a[j]%2==0)
						{
						even=a[j];
						
					System.out.print(even+" ");
					sum+=a[j];}
				}
					System.out.println("The sum of the even numbers is:"+sum);	
				}
	

}
