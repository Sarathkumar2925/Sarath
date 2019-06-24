package wipro;

import java.util.Scanner;

public class Coding_bat {
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		char[] b=str.toCharArray();
		boolean x=false;
		int dot=0;
			for(int i=0;i<b.length;i++)
			{
				if(b[i]=='.')
				{
					dot=i;
				}
			}
			for(int j=0;j<dot;j++)
			{
				if(b[j]=='x'||b[j]=='y'||b[j]=='z')
				{
					x=true;
				}
			}
			if(x==true)
			{
				System.out.println("True");
			}
			else
			{
				System.out.println("False");
			}
		s.close();
	}

}
