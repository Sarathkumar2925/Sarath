package Sarath;

import java.util.Scanner;

public class Vowel 
{
	public static void main(String[] args)
	{
	Scanner s=new Scanner(System.in);
	char a=s.next().charAt(0);
	if((int)a>=97&&(int)a<=122) 
	{
		if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u')
		{
			System.out.println("Vowel");
		}
		else
			System.out.println("Consonant");
	
	}
		
	else
		System.out.println("Invalid");
	}
	
	
	
}
