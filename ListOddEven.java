package wipro;
import java.util.*;
public class ListOddEven {
	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		TreeSet<Integer> even = new TreeSet<Integer>();
		TreeSet<Integer> odd = new TreeSet<Integer>();
		Scanner s = new Scanner(System.in);
		 int n = s.nextInt();
		for(int i = 0;i<n;i++)
		{
			a.add(s.nextInt());
		}
		for(int i:a)
		{
			if(i%2==0)
			{
				even.add(i);
			}
			else
			{
				odd.add(i);
			}
		}
		for(int j:even)
		{
			System.out.print(j);
		}
		System.out.println("");
		for(int j:odd)
		{
			System.out.print(j);
		}
		Iterator<Integer> e = even.iterator();
		Iterator<Integer> o = odd.iterator();
		if(even.first()>odd.first())
		{
			for(int i = 0;i<even.size();i++)
			{
				System.out.print(o.next()+","+e.next()+",");
			}
			if(even.size()<odd.size())
			{
				System.out.println(o.next());
			}
			}
		if(even.first()<odd.first())
		{
			for(int i = 0;i<odd.size();i++)
			{
				System.out.print(e.next()+","+o.next()+",");
			}
			if(even.size()>odd.size())
			{
				System.out.println(e.next());
			}
	}
		s.close();
	}
}
