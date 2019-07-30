package collection;
import java.util.*;
public class treeSet {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
TreeSet<String>ts = new TreeSet<String>();
	ts.add("sarath");
	ts.add("kumar");
	TreeSet ts1 =(TreeSet) ts.clone();
	System.out.println("Reverse:");
	Iterator<String> m = ts.iterator();
	while(m.hasNext())
	{
		StringBuffer sb = new StringBuffer(m.next());
		System.out.println(sb.reverse());
	}
	System.out.println("Elements");
	
	Iterator j=ts1.iterator();
	while(j.hasNext())
	{
		System.out.println(j.next());
	}
	System.out.println("Enter the element to be searched");
	String search = s.next();
	if(ts.contains(search))
	{
		System.out.println("The element is found");
	}
	else
	{
		System.out.println("The element is not found");
	}
}
}