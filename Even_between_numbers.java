package guvi;

import java.util.Scanner;

public class Even_between_numbers {
	public static void main(String[] args) {
			Scanner s=new Scanner(System.in);
			System.out.print("Enter the starting interval:");
			 int n1=s.nextInt();
			System.out.print("Enter the second interval:");
		    int	n2=s.nextInt();
		    for( int i=n1+1;i<n2;i++)
		    {
		    	if(i%2==0)
		    	{
		    		System.out.print(i+" ");
		    	}
		    }
		    s.close();
		}
	}
