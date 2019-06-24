package wipro;
public class Wipro_13 {
public static void main(String[] args)
{
	float x=0;
	int count=0;
	for(int a=10;a<100;a++)
	{
		count=0;
		for( int i=1;i<=a;i++)
		{
			x=(float)a/i;
			if(x==Math.ceil(x))
			{
				count+=1;
			}
		}
		if(count==2)
		{
			System.out.print(a+ " ");
		}
	}
	}
		
}
