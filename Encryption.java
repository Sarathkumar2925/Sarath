package wipro;
import java.util.*;
public class Encryption {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input =s.nextLine();
		String input1 = input.toLowerCase();
		char k = s.nextLine().charAt(0);
		k = Character.toLowerCase(k);
		int key = (int)k-96;
		//System.out.println(key);
		char c []  = input1.toCharArray();
		int fin[] = new int [c.length];
		for(int i= 0;i<c.length-1;i++)
		{
			if(((int)c[i]-96)-key>0)
			{
				fin[i] = ((int)c[i]-96)-key;
			}
			else
			{
				fin[i] = (((int)c[i]-96)-key)+26;
			}
			//System.out.print(fin[i]+"-");
			}
		for(int j= 0;j<fin.length-1;j++)
		{
			//System.out.println("fin :"+fin[j]);
			c[j] =(char)(fin[j]+96);
			//System.out.print(c[j]+"-");
		}
		System.out.println();
		char c1[]  = input.toCharArray();
		for(int  m=0 ;m<input1.length();m++)
		{
			if(Character.isUpperCase(c1[m]))
			{
				c[m] = Character.toUpperCase(c[m]);
			}
		}
		System.out.print("The Encrypted string is: ");
		for(char o:c)
		{
			System.out.print(o);
		}
		s.close();
		}
	}


