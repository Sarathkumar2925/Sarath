package wipro;
import java.util.*;
public class Addsub {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int n =s.nextInt();
		System.out.println("Enter the opt");
		int opt = s.nextInt();
		int res=n;
		int a[] = new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=n-i;
		}
		switch(opt)
		{
		case 1:
		{
			for(int i =1;i<n;i++)
			{
				if(i%2!=0)
				{
					res-=a[i];
				}
				else
				{
					res+=a[i];
				}
			}
			break;
		}
		case 2:
		{
			for(int i =1;i<n;i++)
			{
				if(i%2!=0)
				{
					res+=a[i];
				}
				else
				{
					res-=a[i];
				}
			}
			break;
			
		}
		}
		System.out.println(res);
	}
}