package sarath;

import java.util.Scanner;

public class All_digits_count {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the number:");
		int a=s.nextInt();
		int count=0;
			while(a>0)
			{
				a=a/10;
				count++;		  
			}
			System.out.println("The number of digits are"+count++);   
			s.close();
	}

}
