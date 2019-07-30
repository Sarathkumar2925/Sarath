package wipro;
import java.util.*;
public class Length_of_the_longest_substring {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		int count = 1;
		String r ="";
		HashSet<Character> hs = new HashSet<Character>();
		
		int v =0;
		for(int i = 0 ;i< str.length()-1; i++)
		{
			
			if(str.charAt(i)!=str.charAt(i+1) )
			{
				hs.add(str.charAt(i+1));
				//r+=str.charAt(i+1);
				//hs.add(str.charAt(i+1));
				
			}
		}
		System.out.println(hs.size());
			System.out.println(hs);
		
	}

}
