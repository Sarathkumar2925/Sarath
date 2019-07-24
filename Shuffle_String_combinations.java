package wipro;
import java.util.*;
public class Shuffle_String_combinations {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = "abcdefghijklmnopqrstuvwxyz";
		int n1 = s.nextInt();
		int n2 = s.nextInt();
		String h = str.substring(n1-1, n2);
		System.out.println(h);
		char c[] = h.toCharArray();
		char x =' ';

		for(int i= 0;i<=(n2-n1);i++)
		{	System.out.println(i);
			for(int j = i+1;j<=j;j++)
			{	
				try{
				System.out.println(c[i]+""+c[j]);	
			}
				
			catch(Exception e){}
				continue;
			}
		}
	}

}
