package wipro;
public class Wipro_array9 {
	public static void main(String[] args) {
			int[]arr = {2,4,8,6,8,7,10,100};
			int six=0,seven=0;
			int a=0;
			int	sum=0;
			int	b= 0;
			for(int i=0;i<arr.length;i++)
			{			
					if(arr[i]==6)
					{
						six=i;
						a++;
					}			
					if(arr[i]==7 )
					{
						seven=i;
						b++;
					}			
			}		
				if(six<seven && a!=0 && b!=0)
				{
					for(int i=0;i<arr.length;i++)
					{
						if(i<six || i>seven)
						{
							sum=sum+arr[i];
						}
					}
					System.out.println(sum);
				}
				else {
					for(int i=0;i<arr.length;i++) {
						sum=sum+arr[i];
					}
					System.out.println(sum);
				}
			}
	}

