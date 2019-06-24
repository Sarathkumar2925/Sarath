package wipro;
public class Wipro_6 {

	public static void main(String[] args) 
	{
		int age=Integer.parseInt(args[1]);
		if(args[0].equals("female"))
		{
			if((age>=1)&&(age<=58))
			{
				System.out.print("Interest==8.5%");
			}
			else
			{
				System.out.print("Interest==7.6%");
			}
		}
		if(args[0].equals("male"))
		{
			if((age>=1)&&(age<=60))
			{
				System.out.print("interest==9.2%");
			}
			else
			{
				System.out.print("interest==8.3%");
			}
		}
			
	}

}
