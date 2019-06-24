package wipro;

import java.util.Scanner;

public class Wipro_12 {
public static void main(String[] args)
{
	boolean b=true;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the number:");
	int a=s.nextInt();

	for(int i=2;i<=a-1;i++)
	{
		if(a%i==0)
		{
			b=false;
		}
	}
	if(b)
		System.out.println("Prime");
	else
		System.out.println("Not prime");
	s.close();
		
}
}
