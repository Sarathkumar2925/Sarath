package wipro;

import java.util.Scanner;

public class wipro_5 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		char a=s.next().charAt(0);
		if((int)a>=97&&(int)a<=122||(int)a>=65&&(int)a<=90)
		{
			System.out.print("Alphabet");
		}
		else if((int)a>=48&&(int)a<=57)
		{
			System.out.print("Digit");
		}
		else
		{
			System.out.print("Special Charcter");
		}
		s.close();
	}
	

}
