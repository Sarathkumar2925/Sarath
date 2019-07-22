package wipro;

public class Month_year {
		public static void main(String[] args) {
		String a[] = {"1000","3000","L12u34j"};
		char temp[] = a[2].toCharArray();
		char month[] =new char[3];
		char year[]  = new char[4];
		int j =0,k=0;
		for(int i =0;i<temp.length;i++)
		{	
			if((int)temp[i]<=48 || (int)temp[i]>=57)
			{	
				month[j] = temp[i];
				j++;
			}
			else
			{
				year[k] = temp[i];
				k++;
			}
		}
		for(char h:month)
		{
			System.out.println(h);
		}
		
		}
	}


