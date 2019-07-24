package wipro;
import java.util.*;
public class Pig_Latin {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		String a[] = str.split(" ");
		String b[] = new String[a.length];
		ArrayList<String>ss = new ArrayList<String>();
		for(int i=0;i<a.length;i++)
		{
			ss.add(a[i].substring(1)+a[i].substring(0, 1));
		}
		Iterator<String> i = ss.iterator();
		while(i.hasNext())
				{
				System.out.print(i.next());
				System.out.print("ay");
				if(i.hasNext())
				{
					System.out.print(" ");
				}
				}
		
	}
}
