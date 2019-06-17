package Sarath;
import java.util.Scanner;
public class Array_n_numbers {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the size of the array:");
		int a=s.nextInt();
		System.out.print("Enter the'k'integer:");
		int b=s.nextInt();
		int sum=0;
		int x[]=new int[a];
			for(int i=0;i<a;i++)
			{
				x[i]=s.nextInt();
			}
			for(int i=0;i<b;i++)
			{
				sum=sum+x[i];
			}
			System.out.print(sum);
		s.close();
	}
}
