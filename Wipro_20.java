package wipro;
import java.util.*;
public class Wipro_20
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Menu");
		System.out.println("1.Add");
		System.out.println("2.Sub");
		System.out.print("Enter your option:");
		int a=s.nextInt();
		char nxt='0';
		switch(a)
		{
		case 1:
		{
		do
		{
			System.out.print("Enter two  numbers:");
			int x=s.nextInt();
			int y=s.nextInt();
			int ans=x+y;
			
			System.out.println("Sum is "+ans);
			System.out.print("press'y'to continue 'n'to terminate:");
			nxt=s.next().charAt(0);
		}
		while(nxt=='y');
		break;}
		case 2:
		{
		
		do {
			System.out.print("Enter two  numbers:");
			int x=s.nextInt();
			int y=s.nextInt();
			int ans=x-y;
			System.out.println("sub is "+Math.abs(ans));
			System.out.print("press'y'to continue 'n'to terminate:");
			nxt=s.next().charAt(0);
		}
		while(nxt=='y');
		break;
		}
		default :
		{
			System.out.println("invalid option");
		}
		s.close();
		}
		}		

}
