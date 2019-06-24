package sarath;

import java.util.Scanner;

public class N_prime {

	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the term:");
		int n=s.nextInt();
		int count=0;
		int flag=1;
		for(int j=2;count<n;j++)
		{
		for(int i=2;i<j;i++)
			{
				if(j%i==0)
				{
					flag=2;
				
				break;
				}
			}
		if((flag==1))
		{
			count++;
			System.out.println("counted prime "+j);
		}
				
		else 
			flag=1;
		if(count==n)
			System.out.println(j);
		
		}
		
		s.close();

	}

}
