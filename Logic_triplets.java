package wipro;
import java.util.*;
public class Logic_triplets {
	public static void main(String[] args) {
		ArrayList<Integer>al = new ArrayList<Integer>();
		ArrayList<Integer>al1 = new ArrayList<Integer>();
		int arr[]= {4, 2, 4, 2, 3, 1};
		Scanner s = new Scanner(System.in); 
		System.out.println("Enter the number :");
		int n = s.nextInt();
		for(int i =0;i<arr.length;i++)
		{
			al.add(arr[i]);
		}

		for(int i =1;i<=n;i++)
		{	
			if(n%i==0)
			{	
				al1.add(i);
			}
		}
		
		al.retainAll(al1);
		al.toArray();
		for(int i = 0;i<al.size();i++)
		{
			 
		}
		
		
				
	
	}
}

