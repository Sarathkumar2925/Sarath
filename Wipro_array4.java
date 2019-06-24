package wipro;
public class Wipro_array4 {
	public static void main(String[] args)
	{
		int a[]=new int[128];
		for(int i=0;i<128;i++) {
			a[i] = i;
		}
		for(char i=0;i<a.length;i++) 
		{
			//System.out.println("yes");
				System.out.print((char)a[i]+" ");
		}
		
	}

}
