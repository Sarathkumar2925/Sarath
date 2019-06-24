package sarath;

import java.util.Scanner;

public class Odd_numbers {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("The required numbers are:");
		for(int i=1;i<=100;i++)
		{
			if(i%2>0)
				System.out.print(i+",");
			
		}
		s.close();
	}

}
