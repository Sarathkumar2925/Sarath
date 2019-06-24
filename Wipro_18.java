package wipro;

import java.util.Scanner;

public class Wipro_18 {

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
			System.out.println(old+"is a palindrome number");
		else
			System.out.println(old+"is not a palindrome number");
		s.close();
	}
}
