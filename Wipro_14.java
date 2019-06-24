package wipro;
public class Wipro_14 {
public static void main(String args[]) 
{
	int count=0;
	
	if(args.length==0)
	{
		System.out.println("Please enter a integer number");
	}
	else 
		{
		char b=args[0].charAt(0);
		if(b=='0'||b=='1')
	{
		System.out.println("0 is neither prime nor compsite");
	}
		
	else
	{
		int a=Integer.parseInt(args[0]);
		for(int i=1;i<=a;i++)
		{
			float x=(float)a/i;
			if(x==Math.ceil(x))
			{
				count+=1;
			}
		}
		if(count==2)
		{
			System.out.println("prime");
		}
		else
		{
			System.out.println("not prime");
		}
	}
}
}
}
