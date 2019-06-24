package wipro;

import java.util.Scanner;

public class Positive_negative_zero {
		public static void main(String[] args) {
			Scanner s=new Scanner(System.in);
			System.out.println("enter the number");
			int num=s.nextInt();
			if(num>0)
				System.out.println("Positive");
			else if(num<0)
				System.out.println("Negative");
			else
				System.out.println("Zero");
				s.close();
}

	}
