package sarath;

import java.util.Scanner;

public class Even_Odd_Digits_Sum {

	public static void main(String[] args) {
		System.out.println("Enter the number : ");
		Scanner s=new Scanner (System.in);
		int i=s.nextInt();
		int sum=0,rem=0,x=0;
		System.out.println("Enter ODD OR EVEN");
		String ss=s.next();
		x=ss.length();
		switch(x)
		{
		case 3:
			while(i>0)
			{
				rem=i%10;
				if(rem%2!=0)
				{
					sum+=rem;
				}
				i=i/10;
			}
			break;
		case 4:
			while(i>0)
			{
				rem=i%10;
				if(rem%2==0)
				{
					sum+=rem;
				}
				i=i/10;
			}
			break;
		}
		
		System.out.println(sum);
		s.close();
	}

}
