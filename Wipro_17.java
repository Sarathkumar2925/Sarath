package wipro;

import java.util.Scanner;

public class Wipro_17 {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		while(n>0)
		{
			int rem=n%10;
			System.out.print(rem);
			n=n/10;
		}
		s.close();

	}

}
