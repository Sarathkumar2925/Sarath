package sarath;

import java.util.Scanner;

public class Prime_ceil {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int count=0;
		float x=0;	
		for(int i=1;i<=a;i++)
			{
				 x=(float)a/i;
				//System.out.println(i+ " "+ x+" "+Math.ceil(x));
			if(x==Math.ceil(x))
			{
				count+=1;
			}
			}
		//System.out.println(count);
			if(count==2)
			{
				System.out.println("prime");
			}
			else
				System.out.println("not prime");
			s.close();
	}

}
