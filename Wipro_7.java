package wipro;
import java.util.*;
public class Wipro_7 {
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		char a=s.next().charAt(0);
		char b='0';
		
		if((int)a>=65&&(int)a<=90)
		{
	     b=Character.toLowerCase(a);
		}
		else
		{
			b=Character.toUpperCase(a);
		}
		System.out.println(a+"->"+b);
		s.close();
		
		
	}

}
