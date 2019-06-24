package sarath;

import java.util.Scanner;

public class Sum_digit {
	public static void main(String[] args) 
	{	
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number:");
		int i=s.nextInt();
		int r,sum=0,count=0;
	if(i<0)
	{
		i=-1*i;
		count++;
	}
		while(i>=10)
		{
			while(i>0)
			{
				r=i%10;
				sum+=r;
				i=i/10;		
			}	
		i=sum;
		sum=0;
		}
		if(count==1)
		{
			i=-1*i;
		}
		System.out.println(i);
		s.close();
		
		
	}
	}
