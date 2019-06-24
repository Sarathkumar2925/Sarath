package sarath;

public class Star_diamond_pattern 
{
	public static void main(String[] args)
	{
		for(int i=1;i<=4;i++)
		{
			int m=1;
			for(int j=4;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{	
				System.out.print("*");
				System.out.print(" ");
			}System.out.println("");
		}
		for(int i=2;i<=4;i++)
		{
			int m=1;
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int k=4;k>=i;k--)
			{	
				System.out.print("*");
				System.out.print(" ");
			}
			System.out.println("");
		}
		
		
	}

}
