package inheritance;
import java.util.*;
class patient
{	Scanner s=new Scanner(System.in);
	String name=s.nextLine();

	public double BMI(double weight,double height)
{
	double ans=(weight/(Math.pow(height, 2)))*703;
	return ans;
}
}
public class Patients {

	public static void main(String[] args) {
		patient obj=new patient();
		double w=50.7d;
		double h=70.86d;
		System.out.println(obj.name+"'s BMI-> "+obj.BMI(w, h));
	
	}
}