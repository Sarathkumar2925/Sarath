package wipro;
import java.util.*;
public class Palindrome_possible {
	public static void main(String[] args) {
	
	Scanner s= new Scanner(System.in);
	int num = s.nextInt();
	String str = String.valueOf(num);
	int h = 0;int x =0;
	int arr[] = new int [str.length()];
	while(num!=0)
	{
		h=num%10;
		arr[x++] = h;
		num = num/10;
	}
	int t=0;
	for(int j =0;j<arr.length;j++)
	{	
		for(int k = j+1;k<arr.length;k++)
		{
			if(arr[j]==arr[k]&&arr[j]!='$')
			{
				arr[k] = '$';
			}
			t= 1;
		}
		if(t==1)
		{
			arr[j] ='$';
		}
	}
	int count = 0;
	for(int i= 0; i<arr.length; i++)
	{
		if(arr[i]!='$')
		{
			count++;
		}
	}
	if((arr.length%2==0 || arr.length%2==1) && (count==0 ||count==1))
	{
		System.out.println(count);
	}
	else
		System.out.println(count);
	
	}
	

}
