package wipro;
class A{
	void show()
	{
		System.out.println("In A");
	}
}
class B extends A
{
	void show()
	{
		System.out.println("In b");
	}
}
public class Inhertitance {
	public static void main(String[] args) {
		A obj = new A();
		B obj1 =  new B();
		A obj2  = new B();
		obj.show();
		obj1.show();
		obj2.show();
		
	}
}
