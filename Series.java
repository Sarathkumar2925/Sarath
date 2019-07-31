package wipro;
import java.util.*;
public class Series {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int n = s.nextInt();
	int a =s.nextInt();
	int b = s.nextInt();
	int c = s.nextInt();
	int n1 =Math.abs(a-b);
	//System.out.println(n1);
	int n2 = Math.abs(b-c);
	//System.out.println(n2);
	int num1 = Math.abs(c);
		for(int i = 3;i<n;i++)
		{
			if(i%2!=0)
			{
				num1+=n1;
			}
			else
			{
				num1+=n2;
			}
	}	if(a<0||b<0||c<0)
	{
		System.out.println("-"+num1);
	}
	else
	{
		System.out.println(num1);
	}
}
}
