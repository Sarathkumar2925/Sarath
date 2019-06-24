package sarath;

import java.util.Scanner;

public class Sorting_array {
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
	
	
	for(int m=0;m<n;m++)
	{
	 System.out.println(a[m]);
	}
		
		

}}

