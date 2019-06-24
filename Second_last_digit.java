package sarath;

import java.util.Scanner;

public class Second_last_digit {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=s.nextInt();
		int r=a/10;
		int ans=r%10;
		System.out.println("The second last digit is"+ans);
		s.close();
		
		
	}

}
