package Sarath;

import java.util.Scanner;

public class lphabet_no
{public static void main(String[] args) 
	{
	Scanner s=new Scanner(System.in);
	char a=s.next().charAt(0);
	if((int)a>=97&&(int)a<=122) 
		System.out.println("Alphabet");
	else
		System.out.println("No");
	s.close();
	}
	
	}


