package wipro;
import java.util.*;
public class Primr_divisor {
	public static void main(String[] args) {
		Scanner s  =new Scanner(System.in);
		System.out.print("Enter the number:");
		int n = s.nextInt();
		ArrayList<Integer>al  =new ArrayList<Integer>();
		for(int i =1;i<=n;i++)
		{
			if(n%i==0)
			{
				al.add(i);
				
			}
		}
		int arr[] =new int[al.size()];
		int x =0;int y=0;
		for(int i=0;i<al.size();i++)
		{	
			int p = al.get(i)+(n/al.get(i));
			System.out.println(al.get(i)+"->"+p);
			for(int j = 2;j<p;j++)
			{
				
				if(p%j==0)
				{
					
					arr[x] =1; 
					x++;
					break;
				}
			}
			
		}	
		int k = 0;
		for(int j = 0;j<arr.length;j++)
		{
			
			if(arr[j]==1)
			{
				k=0;
			}
			else
			{
				k=1;
			}
		}
		if(k==1)
		{
			System.out.println("prime divisor");
		}
		else
		{
			System.out.println("Not prime divisor");
		}
	}
}
