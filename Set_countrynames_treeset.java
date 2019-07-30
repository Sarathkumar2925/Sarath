package collection;
import java.util.*;

	class Country
	{	
		TreeSet <String>H1 = new TreeSet<String>();
		void getCountryNames(String k)
		{
				H1.add(k);
		}
		void get()
		{
			Iterator <String>i = H1.iterator();
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
	public class Set_countrynames_treeset {

		public static void main(String[] args) 
		{
			Country obj = new Country();
			obj.getCountryNames("India");
			obj.getCountryNames("America");
			obj.getCountryNames("Africa");
			obj.getCountryNames("Antartica");
			obj.getCountryNames("Europe");
			obj.getCountryNames("Asia");
			obj.get();
			System.out.println("----------------");
			obj.getCountry("Africa");
			
			
}
}
