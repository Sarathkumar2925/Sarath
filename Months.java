package collection;

import java.util.*;

public class Months {
	public static void main(String[] args) 
	{
	ArrayList<String>al = new ArrayList<String>();
	al.add("January");
	al.add("February");
	al.add("March");
	al.add("April");
	al.add("May");
	al.add("June");
	al.add("July");
	al.add("August");
	al.add("September");
	al.add("October");
	al.add("November");
	al.add("December");
	Iterator<String> i = al.iterator();
	while(i.hasNext())
	{
		System.out.println(i.next());
	}

}
}
