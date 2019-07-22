package wipro;

import java.util.Arrays;

public class Arrange_odd_even2 {
	public static void main(String[] args) {
		
		//int arr[] = {1, 3, 2, 5, 4, 7, 10};
		int count = 0;
		int arr[] = {9, 8, 13, 2, 19, 14};
		for(int i = 0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				count++;
			}
		}
		int even[]  = new int[count];
		int odd[] = new int[Math.abs(arr.length-count)];
		int m=0,n=0;
		for(int i= 0;i<arr.length;i++)
		{
			if(arr[i]%2 ==0)
			{
				even[m++] = arr[i];
			}
			else
			{	
				odd[n] =arr[i];
				n++;
			}
		}
		Arrays.sort(even);
		Arrays.sort(odd);
		if(even[0]>odd[0])
		{
		for(int i =0;i<even.length;i++)
		{
			System.out.print(odd[i]+","+even[i]+",");
		}
		if(even.length<odd.length)
		{
			System.out.print(odd[count]);
		}
		}
		else
		{
			for(int i =0;i<odd.length;i++)
			{
				System.out.print(even[i]+","+odd[i]+",");
			}
			if(even.length<even.length)
			{
				System.out.print(even[count]);
			}
		}
			
		
		}
	}


