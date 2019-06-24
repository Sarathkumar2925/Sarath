package wipro;
import java.util.Scanner;
public class Wipro_19 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the divider:");
		int a=s.nextInt();
		int i=1;
		while(i<=5)
		{
		System.out.print(a*i+" ");
			i++;
		}
		s.close();
	}
}


