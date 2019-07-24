package wipro;
import java.util.*;
public class Moser_deBruijn_series {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Double a = 0.0;
		Double b = 1.0;
		Double x = a;
		Double y= b;
		Double c =a;Double v = b;
		Double n  = s.nextDouble();
		HashSet<Double>l = new HashSet<Double>();
		HashSet<Double>al = new HashSet<Double>();
		HashSet<Double>aa = new HashSet<Double>();
		//System.out.print(a+" "+b+" ");
		for(int i = 1;i<=n;i++)
		{	
			Double m = y*4;
			Double o = m+1;
			l.add(m);
			l.add(o);
		System.out.print(m+" "+o+" ");
			y =m;
			
		
			
		}
		System.out.println();
		System.out.println("----------------");
		for(int i = 1;i<=n;i++)
		{	
			Double m = v*4;
			Double o = m+1;
			al.add(m);
			al.add(o);
			System.out.print(m+" "+o+" ");
			v =m+1;
			
		}
		System.out.println();
		System.out.println("---------------------");
		aa.addAll(l);
		aa.addAll(al);
		TreeSet <Double>ts = new TreeSet<Double>();
		ts.addAll(aa);
		//System.out.println("");
		//System.out.println("-----------------------");
		System.out.print(Math.round(a)+" "+Math.round(b)+" ");
		for(Double f:ts)
	
			System.out.print(Math.round(f)+" ");
			
	}

}
