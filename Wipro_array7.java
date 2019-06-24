package wipro;
import java.util.Scanner;
import java.util.HashSet;
 class Wipro_array7 {
	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		System.out.print("Enter the size of the array:");
		int n=s.nextInt();
		int[] a=new int[n];
			for(int i=0;i<n;i++)
			{
				a[i]=s.nextInt();												
			}																	
			HashSet<Integer> x=new HashSet<>();									
			for(int i=0;i<n;i++)
			{
				x.add(a[i]);
			}
			for(int y:x)
			{
				System.out.print(y+" ");
			}
		s.close();	
	}

}
