package wipro;

public class Wipro_array10 {
	public static void main(String[] args) 
	{if(args.length<4)
	{
		System.out.println("Please Enter 4 integer numbers");
	}		
	else {
		int[][] arr = new int[2][2];
		int a=0;
		for(int i=0; i<2; i++)
		{
			for(int j=0; j<2; j++)
			{
				arr[i][j] = Integer.parseInt(args[a++]);
			}
		}
		System.out.println("The original matrix is:");
			for(int j=0;j<arr.length;j++)
			{
				for(int k=0;k<arr.length;k++)
				{
					System.out.print(arr[j][k]+" ");
				}
				System.out.println("");
			
			}
		
		System.out.println("The reversed matrix is:");
		for(int i=1; i>=0; i--)
		{
			for(int j=1; j>=0; j--)
			{
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}


		
	}

}
