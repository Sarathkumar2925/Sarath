package wipro;

public class Occuring_digits {
	public static void main(String[] args)
	{
		int arr[] = {1237,262,666,140};
		String str = "";
		for(int i=0;i<arr.length;i++)
		{
			 str += String.valueOf(arr[i]);
		}
		System.out.println(str);
		char c[]= str.toCharArray();
		int counter1 = 0;
		int number1 = 0;
		
		for(int i = 0;i<c.length;i++)
		{
			int count = 1;
			for(int j=i+1;j<c.length;j++)
			{
				
				if(c[i]==c[j])
				{
					count++;
				}
			}
			if(counter1<count)
				{
					counter1 = count;
					number1 = Character.getNumericValue(c[i]);
				}
		}
		System.out.println("element"+"="+number1);
		System.out.println("count"+"="+counter1);
	}


}
