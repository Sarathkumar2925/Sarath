package array_problems;
import java.util.*;
public class Array_reverse_10 {
	public static void main(String[] args) {
		if(args.length == 0)
		{
			System.out.println("Please Enter 4 integer numbers");
		}		
		else {
			int[][] arr1 = new int[2][2];
			int a=0;
			for(int i=0; i<2; i++)
			{
				for(int j=0; j<2; j++)
				{
					arr1[i][j] = Integer.parseInt(args[a++]);
				}
			}
			for(int i=1; i>=0; i--)
			{
				for(int j=1; j>=0; j--)
				{
					System.out.print(arr1[i][j] + " ");
				}
				System.out.println();
			}
		}

	}
}

