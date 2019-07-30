package collection;
import java.util.*;
public class numbers_only {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	ArrayList<Number>al = new ArrayList<Number>();
	int n =s.nextInt();
	for(int i = 0;i<n;i++)
	{
		al.add(s.nextInt());
	}

}
}
