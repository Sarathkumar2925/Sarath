package sarath;

import java.util.Scanner;

public class Palinrom_Number {

	public static void main(String[] args) {
		System.out.println("Enter the number :");
		Scanner s=new Scanner (System.in);
		int num=s.nextInt();
		int old=num,rem=0,sum=0;
		while(num>0)
		{
			rem=num%10;
			sum=sum*10+rem;
			num=num/10;
		}
		if(sum==old)
			System.out.println("Yes");
		else
			System.out.println("No");
		s.close();
	}

}
