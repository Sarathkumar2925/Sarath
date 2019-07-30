package collection;
import java.util.*;
public class Set_EmployeeName {
	public static void main(String[] args) {
	HashSet <String> hs = new HashSet<String>();
	hs.add("Sarath");
	hs.add("Sarath1");
	hs.add("Sarath2");
	hs.add("Sarath3");
	hs.add("Sarath4");
	hs.add("Sarath5");
	hs.add("Sarath6");
	Iterator i = hs.iterator();
	while(i.hasNext())
	{
		System.out.println(i.next());
	}
}
}
