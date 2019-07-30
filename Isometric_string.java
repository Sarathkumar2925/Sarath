package wipro;
import java.util.*;
public class Isometric_string {
public static void main(String[] args) {
	Scanner s  =new Scanner(System.in);
	String str1 = s.next();
	String str2 = s.next();
	if(str1.length()!=str2.length())
	{
		System.out.println("False");
	}
	else
	{
		if(str1.charAt(0)==str1.charAt(1)&&str2.charAt(0)==str2.charAt(1))
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("false");
		}
	}
	s.close();
}
}
