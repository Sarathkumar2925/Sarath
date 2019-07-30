package collection;
import java.util.*;
class Java
{	
	HashSet <String>H1 = new HashSet<String>();
	void getCountryNames(String k)
	{
			H1.add(k);
	Iterator i = H1.iterator();
	/*while(i.hasNext())
	{
		System.out.println(i.next());
	}*/
	}
	void get()
	{
		Iterator i = H1.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}
	void getCountry(String h)
	{
		if(H1.contains(h)) {
			System.out.println(h);
		}
		else
		{
			System.out.println("null");
		}
		
	}
}
public class Set_countrynames
{
	public static void main(String[] args) 
	{
		Java obj = new Java();
		obj.getCountryNames("India");
		obj.getCountryNames("India1");
		obj.getCountryNames("India2");
		obj.getCountryNames("India3");
		obj.getCountryNames("India4");
		obj.getCountryNames("India5");
		obj.get();
		obj.getCountry("Africa");
		
		
	}
}
		