package inheritance;
class calculator{
	static int  PowerInt(int num1, int num2)
	{
		return(int) Math.pow(num1, num2);
	}
	static double PowerDouble(double num1,int num2)
	{
		return Math.pow(num1,num2);
	}
}
public class Inheritance_2 {
	public static void main(String[] args) {
		System.out.println(calculator.PowerInt(2, 4));
		System.out.println(calculator.PowerDouble(2.5, 5));
	}

}
