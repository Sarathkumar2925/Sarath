package rough;
import java.util.*;
public class Stable_unstable {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		String a[] = new String[5];
		a[0] = s.next();
		a[1] = s.next();
		a[2]= s.next();
		a[3]= s.next();
		a[4]= s.next();
		int stable=0;
		int unstable = 0;
		for(int i = 0;i<a.length;i++)
		{
			char temp[] = a[i].toCharArray();
			int count=0;
				for(int j =0;j<temp.length;j++)
				{
					for(int k =j+1;k<temp.length;k++)
					{
						if(temp[j]==temp[k])
						{
							count++;
						}
					}
				}
						if(count%2==0||count==0)
						{
							stable+=Integer.parseInt(a[i]);
						}
						else
						{
							unstable+=Integer.parseInt(a[i]);
						}
					}
					System.out.println(Math.abs(stable-unstable));
						}	
		}
		
