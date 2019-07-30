package wipro;
import java.util.*;
public class Random_number {
	public static void main(String[] args) {
		Scanner s  =new Scanner(System.in);
		int n =s.nextInt();
		String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String numbers = "1234567890";
		Random rand = new Random();
		char text[]  = new char[characters.length()];
		char num[]  = new char[numbers.length()];
		char number[]  = new char[numbers.length()];
		int length = 4;
for(int k = 0;k<n;k++)
{
for(int i = 0;i<length;i++)
{
	text[i] = characters.charAt(rand.nextInt(characters.length()));
}

for(int i =0;i<length;i++)
{
	number[i] = numbers.charAt(rand.nextInt(numbers.length()));
}
for(int i =0;i<length;i++)
{
	System.out.print(text[i]+""+number[i]);
}
System.out.println("");
}
		
	}
}
