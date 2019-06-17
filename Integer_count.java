package Sarath;

import java.util.Scanner;

public class Integer_count {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int count=0;
		while(a>0)
		{
			int rem=a%10;
			count++;
			a=a/10;
		}
		System.out.println(count);
		s.close();
	}

}
