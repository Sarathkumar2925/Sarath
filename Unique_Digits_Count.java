package sarath;

import java.util.Scanner;

public class Unique_Digits_Count {

	public static void main(String[] args) {
		System.out.println("Enter the number : ");
		Scanner s=new Scanner (System.in);
		int n=s.nextInt();
		int o=1,i=0,r=0,count=0;
		int b=n;
		while(n>o)
		{
			n=n/10;
			o+=1;
		}
		int a[]=new int[o];
		while(b>0)
		{
			r=b%10;
			a[i]=r;
			i++;
			b=b/10;
		}
		for(int j=0;j<o;j++)
		{
			for(int k=j+1;k<o;k++)
			{
				if(a[j]==a[k])
					a[k]='$';
			}
			if(a[j]!='$')
				count++;
		}
		System.out.println(count);
		s.close();
	}

}
