package inheritance;

class animal
{
	void eat() {
		System.out.println("I am eating.");
	}
	void sleep()
	{
		System.out.println("I am sleeping.");
}
}
	class Birds extends animal
	{
		void fly()
		{
			System.out.println("I am flying");
		}
	}
public  class Inhertitance_animal {
	public static void main(String[] args) {
	animal a=new animal();
	Birds b=new Birds();
	a.eat();
	a.sleep();
	b.fly();
	b.eat();
	b.sleep();
	
	


	}

}

