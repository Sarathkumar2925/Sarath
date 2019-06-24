package sarath;

import java.util.Scanner;

public class Non_repeating_digits_count {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=s.nextInt();
		int i=0,n=1,count=-1,r=0;
		int num1=num;
		while(num1>0)
			{
				num1=num1/10;
				n+=1;	
			}
		int arr[]=new int[n];
			while(num>0)
			{
				r=num%10;
				arr[i]=r;
				i++;
				num=num/10;
			}
		for(int j=0;j<n;j++)
		{
			for(int k=j+1;k<n;k++)
			{
				if(arr[j]==arr[k])
				{
					arr[j]='$';
					arr[k]='$';
				}
			}
					
						if(arr[j]!='$')
						{
							count+=1;
						}
				
			}
				System.out.println(count);
			    s.close();
			}
		
		}

	


