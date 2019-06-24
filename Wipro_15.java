package wipro;
import java.util.*;
public class Wipro_15 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String num=s.next();
		int sum=0;
		char a[]=num.toCharArray();
		for(int i=0;i<a.length;i++)
		{
			sum=sum+Character.getNumericValue(a[i]);
		}
		System.out.println(sum);
		s.close();
	}

}
