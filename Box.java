package inheritance;

import java.util.Scanner;

public class Box {
	public double volume(double w,double l,double h)
	{	
		return w*l*h;
	}
	public static void main(String args[])
		{	Scanner s=new Scanner(System.in);
			System.out.print("Enter the width:");
			double w=s.nextDouble();
			System.out.print("Enter the length: ");
			double l=s.nextDouble();
			System.out.print("Enter the height");
			double h=s.nextDouble();
			Box b=new Box();
			System.out.println(b.volume(w,l,h));
			s.close();
	
		}
}
