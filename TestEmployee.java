package inheritance2;

public class TestEmployee {
	public static void main(String[] args) {
		Person obj1=new Person();
		Employee obj2=new Employee();
		obj1.person("SARATH KUMAR G");
		obj2.Employee(1500, 2019,"abc12");
		System.out.println(obj1.name);
		System.out.println(obj2.salary);
		System.out.println(obj2.yearStarted);
		System.out.println(obj2.InsuranceNo);
		
		

}
}
