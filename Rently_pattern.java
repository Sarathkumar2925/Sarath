package sarath;
public class Rently_pattern {
	public static void main(String[] args)
	{	
		int m=4;
		for(int i=1;i<=5;i++)
		{
			for( int j=1;j<=5;j++)
			{
				if((i==1)||(i==5)||(j==5)||(j==1))
					{
					System.out.print("* ");
					}
				else if((j==3)&&(i==3))
					{
					System.out.print("  ");
					}
				else
					{
					System.out.print("  ");
					}
			}
			System.out.println();
		}
	
		

	}

}
