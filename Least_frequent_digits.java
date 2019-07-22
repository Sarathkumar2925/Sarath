package wipro;
public class Least_frequent_digits {
public static void main(String[] args) {
	//int a[] = {1236, 262, 666, 121};
	int a[] = {1237, 202, 666, 140};
	String str = "";
	for(int i=0;i<a.length;i++)
	{
		 str += String.valueOf(a[i]);
	}
	System.out.println(str);
	char c[] = str.toCharArray();
	int arr []  = new int [c.length];
	int fin = 0;
	for(int i = 0;i<c.length;i++)
	{
		int count = 0;
		for(int j= i+1;j<c.length;j++)
		
		{	
			if(c[i] == c[j])
			{
				c[j] = '$';
				count++;
			}
		}
		if(count==0&&c[i]!='$')
		{
			arr[i] = Character.getNumericValue(c[i]);
			fin+=arr[i];
			
		}
		}
	System.out.println(fin);
	}
}

