package inheritance;
class Author
{
	private String name;
	private String email;
	private char gender;
	public Author(String n,String e,char g)
	{
		name=n;
		email=e;
		gender=g;	
	}
}
class Book
{
	private String name;
	private String Author;
	private double price;
	private int qtyInStock;
	public Book(String n,String a,double p,int q)
	{
		name=n;
		Author=a;
		price=p;
		qtyInStock=q;
	}
	public double setprice(double p)
	{
		return price=p;
	}
	public int setqtyIntStock(int q)

	{
		return qtyInStock=q;
	}
	public String getname()
	{
		return name;
	}
	public String getAuthor()
	{
		return Author;
	}
	public double getprice()
	{
		return price;
	}
	public int qtyInStock()
	{
		return qtyInStock;
	}
}
public class Inheritance_4 {
	public static void main(String[] args) {
	//Author a=new Author("Sarath","gsvsp@gmail.com",'m');
	Book b=new Book("life","Sarath",100.00,15);
	System.out.println("name -> "+b.getname());
	System.out.println("price -> "+b.getprice());
	System.out.println("Instock -> "+b.qtyInStock());
}
}
