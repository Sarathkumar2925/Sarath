package wipro;

import java.util.Scanner;

public class wipro_8 {
public static void main(String[] args)
{	

		Scanner n=new Scanner(System.in);
		System.out.println("Enter the values");
		char a=n.next().charAt(0);
		String d="0";
		char b=a;
		if (a==('r'))
		{
			a=1;
		}
		if (a==('b'))
		{
			a=2;
		}
		if (a==('g'))
		{
			a=3;
		}
		if (a==('o'))
		{
			a=4;
		}
		if (a==('y'))
		{
			a=5;
		}
		if (a==('w'))
		{
			a=6;
		}
		switch(a)
		{
	case 1: 
        d = "Red"; 
        break; 
    case 2: 
        d = "Blue"; 
        break; 
    case 3: 
        d = "Green"; 
        break; 
    case 4: 
        d = "Orange"; 
        break; 
    case 5: 
        d = "Yellow"; 
        break; 
    case 6: 
        d = "White"; 
        break; 
    default: 
        d = "Invalid color"; 
        break; 
	} n.close();
        System.out.println(b+"->"+d); 
		

	}


}

