package wipro;
import java.util.Arrays;
public class Month_year {
	public static void main(String[] args) {
		String a[] = {"1000","3000","L12u34j"};
		char temp[] = a[2].toCharArray();
		char year[]  = new char[4];
		int d=0;
		String ss ="";
		String ss1="";
		char ss2[] = new char[ss1.length()];
		for(int i =0;i<temp.length;i++)
		{	
			if((int)temp[i]<=48 || (int)temp[i]>=57)
			{	
				ss+=String.valueOf(temp[i]);
				 ss1=ss.toUpperCase();
				 
				
			}
			else
			{
				year[d] = temp[i];
				d++;
			}
		}
		ss2= ss1.toCharArray();
		String t ="";
		for(int i =0;i<year.length;i++)
		{
			t+=year[i];
		}
		String my[] = new String[24];
		char q =' ';
		char w =' ';
		char e =' ';
		char r =' ';
		int z = 0;
		for(int i = 0;i<year.length;i++)
		{
			for(int j =0;j<year.length;j++ )
			{
				for(int k=0 ;k<year.length;k++)
				{
					for(int l =0;l<year.length;l++)
					{
						q=t.charAt(i);
						w=t.charAt(j);
						e=t.charAt(k);
						r=t.charAt(l);
						if(q!=w && q!=e &&q!=r &&w!=e && w!=r && e!=r )
						{	
							if(q==a[0].charAt(0) || q ==a[1].charAt(0)-1)
							{	
							my[z]=(q+""+w+""+e+""+r);
							z++;
							}
						}	
					}
				}
			}
		}
		//System.out.println(ss1);
		int Month = 0;
		
		for(int i = 0;i<ss1.length();i++)
		{
			Month +=ss2[i];
		}	
		
		//System.out.println(Month);
		int m1 = (int)('J'+'A'+'N');
		int m2 = (int)('F'+'E'+'B');
		int m3 = (int)('M'+'A'+'r');
		int m4 = (int)('A'+'P'+'R');
		int m5 = (int)('M'+'A'+'Y');
		int m6 = (int)('J'+'U'+'N');
		int m7 = (int)('J'+'U'+'L');
		int m8 = (int)('A'+'U'+'G');
		int m9 = (int)('S'+'E'+'P');
		int m10 = (int)('O'+'C'+'T');
		int m11 = (int)('N'+'O'+'V');
		int m12 = (int)('D'+'E'+'C');
		int x = 0;
		String Months[] = {"JAN","FEB","MAR","APR","MAY","JUN","JUL","AUG","SEP","OCT","NOV","DEC"};
		if(Month==m1)
		{
			System.out.println("s");
			x=0;
			
		}
		if(Month==m2)
		{
			x=1;
		}
		if(Month==m3)
		{
			x=2;
		}
		if(Month==m4)
		{
			x=3;
		}
		if(Month==m5)
		{
			x=4;
		}
		if(Month==m6)
		{
			x=5;
		}
		if(Month==m7)
		{
			
			x=6;
		}
		if(Month==m8)
		{
			x=7;
		}
		if(Month==m9)
		{
			x=8;
		}
		if(Month==m10)
		{
			x=9;
		}
		if(Month==m11)
		{
			x=10;
		}
		if(Month==m12)
		{
			x=11;
		}
		int count= 0;
		for(int i =0;i<my.length;i++)
		{
			if(my[i]!=null)
			{
				System.out.println(Months[x]+"/"+my[i]);
				count++;
			}
		}
		System.out.println(count);
	}
}
