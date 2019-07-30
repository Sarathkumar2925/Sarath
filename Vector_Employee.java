package collection;
import java.util.*;
public class Vector_Employee {
	public static void main(String[] args) {
		Vector a = new Vector();
		a.add("emp_id=500");
		a.add("emp_name = Sarath");
		a.add("emp_dept = Mechanical");
		Iterator i = a.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
	}
	

}
