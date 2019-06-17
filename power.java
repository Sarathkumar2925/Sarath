package Sarath;
import java.util.*;
public class power 
{

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Entr the number:");
		int a=s.nextInt();
		System.out.print("Enter the times:");
		int b=s.nextInt();
		int c=(int)Math.pow(a,b);
		System.out.print(c);
	}
}
