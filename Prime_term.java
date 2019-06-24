package sarath;

import java.util.Scanner;

public class Prime_term {
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the range:");
		int term=s.nextInt();
		System.out.print("Enter the term:");
		int n=s.nextInt();
		int count=0;int ans=0;
			for(int i=2;i<=term;i++)
			{
				for(int j=2;j<=i;j++)
				{
					if(j==i)
						{
						System.out.println(i);
						count++;
							if(count==n)
							{
								 ans=i;
								
							}
						}
					if(i%j==0)
						break;
				}	
			}
			//System.out.println("There are "+count+" prime numbers in the given range.");
			System.out.println(ans);
			s.close();
		
	}

}
