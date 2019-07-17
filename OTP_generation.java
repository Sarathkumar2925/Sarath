package rough;
import java.util.*;
public class OTP_generation {
	public static void main(String[] args) {
Scanner s = new Scanner(System.in);
System.out.print("Enter the name of the account holder:");
String input1 = s.nextLine();
System.out.print("Enter the account number:");
String input2 =s.nextLine();
System.out.print("Enter the type of the account:");
String input3 =s.nextLine();
String pin1 = input3.substring(0,2);
System.out.print(pin1);
char pin2 = String.valueOf(input2).charAt(0);
System.out.print(pin2);
int p=0,sum=0;
for(int i = 0;i<5;i++)
{
	
 p += Character.getNumericValue(input2.charAt(i));
}
while(p>0)
{
	int rem = p%10;
	 sum +=rem;
	p = p/10;
}
System.out.print(sum);
char pin4 = input1.charAt(0);
System.out.print(pin4);


int q=0,sum1=0;
for(int i =5;i<10;i++)
{
	
 q+= Character.getNumericValue(input2.charAt(i));
}
while(q>0)
{
	int rem = q%10;
	 sum1+=rem;
	q= q/10;
}
System.out.print(sum1);
char pin6 = input1.charAt(input1.length()-1);
System.out.print(pin6);
char pin7 = input2.charAt(input2.length()-1);
System.out.print(pin7);

	}
}