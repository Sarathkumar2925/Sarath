package rough;

import java.util.Arrays;
import java.util.Scanner;

class Sample {
	public static void main(String [ ]  args) {
		Scanner s = new Scanner(System.in);
		int x=s.nextInt()	;
		int y=s.nextInt()	;
		int z=s.nextInt()	;
		char min=' ';
		int j=1;
		char big='0';
		char pin[]=new char[4];
		
		char ar1[]=String.valueOf(x).toCharArray();
		char ar2[]=String.valueOf(y).toCharArray();
		char ar3[]=String.valueOf(z).toCharArray();
		char c[][] =new char[3][3];
		for(int i =0;i<3;i++)
		{
			c[0][i]=ar1[i];
		}
		for(int i =0;i<3;i++)
		{
			c[1][i]=ar2[i];
		}
		for(int i =0;i<3;i++)
		{
			c[2][i]=ar3[i];
		}
		
		for(int i=0;i<3;i++)
		{
			if(ar1[i]<ar2[i]&&ar1[i]<ar3[i])
			{
				min=ar1[i];
			}
			else if(ar2[i]<ar3[i])
			{
				min = ar2[i];
			}
			else
			{
				min =ar3[i];
			}
			pin[j]=min;
			j++;	
		}
		
		for(int i=0;i<c.length;i++)
		{
			for(int k=1;k<c.length;k++)
			{
				if(c[i][i]>c[i][k])
				{
					big= c[i][i];
					c[i][i]=c[i][k];
				}
			}
			pin[0]=big;
			
			
		}
		for(int i=0;i<=c.length;i++)
		{
			System.out.print(pin[i]);
		}
		
		}
		
		
			
		
	}
