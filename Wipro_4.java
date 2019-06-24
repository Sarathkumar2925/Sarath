package wipro;
import java.util.Scanner;
public class Wipro_4 {
	public static void main(String[] args)
	{	Scanner s=new Scanner(System.in);
		char a=s.next().charAt(0);
		char b=s.next().charAt(0);
		int x=(int)a;
		int y=(int)b;
		if(x<y)
		{
			System.out.print(a+" "+b);
		}
		else
		{
			System.out.print(b+""+a);
		}
		s.close();
		
	}

}
