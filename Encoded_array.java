 package rough;
 import java.util.*;
public class Encoded_array {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a[] = {7,6,8,16,12,3};
		int sum = 0;
		int x = a.length-1;
		int arr[] = new int[a.length];
		arr[x] = a[x];
		System.out.println(arr[x]);
		for(int i= x;i>0;i--)
		{	
			arr[i-1]=a[i-1]-arr[i];
		}
		System.out.println("First element "+"= "+arr[0]);
		for(int y= 0;y<arr.length;y++)
		{
				sum +=arr[y];
		}
		System.out.println("Sum"+"="+sum);
		s.close();
		
	}
}
