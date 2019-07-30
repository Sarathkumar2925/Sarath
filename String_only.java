package collection;
import java.util.*;
	public class String_only
	{
		public static void main(String[] args) 
		{
			ArrayList<String> al =  new ArrayList<String>();
			al.add("hi");
			al.add("Hello");
			class PrintAll
			{
				void PrintAll()
				{
					Iterator <String>i = al.iterator();
					while(i.hasNext())
					{
						System.out.println(i.next());
					}
				}
			}
			PrintAll d =new PrintAll();
			d.PrintAll();

		}			
}
	


