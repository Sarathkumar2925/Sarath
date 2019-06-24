package wipro;
import java.util.Scanner;
public class Wipro_array3 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the array size:");
		int n=s.nextInt();
		int index=0;
		int a[]=new int[n];
			for(int i=0;i<a.length;i++)
			{
					a[i]=s.nextInt();
			}
		System.out.print("Enter the number to be searched:");
		int b=s.nextInt();
			for(int i=0;i<a.length;i++)
			{if(a[i]==b)
				index=i;
			   
			}
			if(index>0)
			{
				System.out.println(index);
			}
			else
			{
				System.out.print("-1");
			}
			s.close();
	}

}
