package sarath;

import java.util.Scanner;

public class Last_number {
	public static void main(String[] args) {
		int r=0;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the number:");
		int a=s.nextInt();
			 r=a%10;
		System.out.print(r);
		s.close();
	}

}
