package wipro;
import java.util.Scanner;
public class Odd_even {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("enter the number:");
		int a=s.nextInt();
		if(a%2==0)
		{
				System.out.println("Even");
		}
		else
		{
				System.out.println("Odd");
		}
		s.close();
}

}
