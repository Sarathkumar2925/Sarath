package sarath;

import java.util.Scanner;

public class Greater_number {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter 2 numbers:");
	int a=s.nextInt();
	int b=s.nextInt();
	if(a>b)
			System.out.println("Number a is greater than b");
		else
			System.out.println("number b is greater then a");
	s.close();
	
}
}
