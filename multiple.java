package sarath;

import java.util.Scanner;

public class multiple {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number:");	
		int a=s.nextInt();
		System.out.println("Enter the multiple:");
		int b=s.nextInt();
		if(a%b==0)
			System.out.println("The number is multiple of "+b);
		else
			System.out.println("The number is not a multiple of "+b);
		s.close();
		
	}

}
