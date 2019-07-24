package wipro;
import java.util.*;
public class Alpha_numeric {
	public static void main(String[] args) {
		
		HashSet<Double>hs = new HashSet<Double>();
		HashSet<Character>hd = new HashSet<Character>();
		for(int i =0;i<4;i++)
		{
			double a =0+(Math.random()*9);
			System.out.println("->"+(int)a);
			hs.add(a);
		}
		System.out.println("------------------------------");
		for(int i = 0 ;i<4;i++)
		{
			double b  =67+(Math.random()*90);
			System.out.println((int)b);
//			int c = (int)b;
//			char d = (char)c;
//			System.out.println("->"+d);
//			hd.add(d);
		}
//		for(Double j:hs)
//		{
//			System.out.println(Math.round(j));
//		}
		
	}

}
