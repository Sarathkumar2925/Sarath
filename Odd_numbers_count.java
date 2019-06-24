package sarath;

import java.util.Scanner;

public class Odd_numbers_count {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number:");
		int a=s.nextInt();
		int r,sum=0;
		while(a>0)
		{
			r=a%10;
			a=a/10;
				if(r%2!=0)
				{
					sum+=r;
				}
		}
		System.out.println(sum);
		s.close();

	}

}
