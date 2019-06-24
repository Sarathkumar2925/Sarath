package wipro;

import java.util.Scanner;

public class Wipro_array2 {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the size of the array:");
	int n=s.nextInt();
	int a[]=new int[n];
	System.out.println("Enter the members of the array:");
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}		
	int max=a[0];
	 for(int j=0;j<n;j++)
	 {
		 if(a[0]<a[j])
		 {
			 max=a[j];
		 }
	 }
	 System.out.println("The largest number in the array is "+max);
	 int min=a[0];
	 for(int k=0;k<n;k++)
	 {
		 if(a[0]>a[k])
		 {
			 min=a[k];
		 }
	 }
	 System.out.println("The smallest number in the array is"+min); s.close();
	 }
	 
	

}

