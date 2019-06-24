package wipro;

import java.util.Scanner;

public class Wipro_array5 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int n=s.nextInt();
		int j;
		int temp=0,k;
		int a[]=new int[n];
			for(int i=0;i<a.length;i++)
			{
				a[i]=s.nextInt();
			}
			for(j=0;j<n;j++)
			{
				for( k=0;k<n;k++)
					if(a[j]<a[k])
					{
						
						temp=a[j];
						a[j]=a[k];
						a[k]=temp;
					}
					}
		System.out.println("The largest two numbers in the array are"+ a[n-1] +" and " +a[n-2]);
		System.out.println("The smallest two numbers in the array are"+ a[0] +" and " +a[1]);	
		s.close();
	}

}
