package Sarath;

import java.util.Scanner;

public class Sum_of_natural_numbers {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int sum=0;
		for(int i=0;i<=a;i++)
		{
			sum=sum+i;
		}
		System.out.println(sum);
		s.close();
	}

}
