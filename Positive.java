package Sarath;

import java.util.Scanner;

public class Positive {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		if(a>0)
		{
			System.out.println("Positive");
		}
		else if(a==0)
		{
			System.out.println("Zero");
		}
		else
			System.out.println("Negative");
		s.close();
	}

}
