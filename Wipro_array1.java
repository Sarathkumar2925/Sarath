package wipro;
import java.util.*;
public class Wipro_array1 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the size of the array:");
		int x=s.nextInt();
		int sum=0;
		int a[]=new int[x];
			for(int i=0;i<a.length;i++)
			{
				a[i]=s.nextInt();
			}
			for(int i=0;i<a.length;i++)
			{
				sum+=a[i];
			}
			int average=sum/a.length;
			System.out.println("Sum of the array is"+sum);
			System.out.println("Anerage of the array is"+average);
		
		s.close();
	}

}
