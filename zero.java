package sarath;
import java.util.Scanner;
public class zero {
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
			System.out.println("enter the number");
			int num=s.nextInt();
	if(num>0)
		System.out.println("The number is positive");
	else if(num<0)
		System.out.println("The number is negative");
	else
		System.out.println("The number is zero");
	s.close();
	}

}
