package wipro;
import java.util.*;
public class Check_two_strings {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	String str1 = s.next();
	String str2 = s.next();
	char[] c = str1.toCharArray();
	LinkedHashSet<Character> hs = new LinkedHashSet<Character>();
	for(int i= 0;i<str1.length();i++)
	{
		hs.add(c[i]);
	}
	System.out.println(hs.toString());
	String d ="";
	Iterator i = hs.iterator();
	while(i.hasNext())
	{
		d+=i.next();
	}
	System.out.println(d);
if(str2.equals(d))
{
	System.out.println("Yes");
}
else
{
	System.out.println("false");
}
}
}
