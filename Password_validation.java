package wipro;
import java.util.*;
public class Password_validation {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str1 = s.next();
		int alpha_count=0;
		int upper_count=0;
		int lower_count=0;
		int special_count =0;
		int digit_count=0;
		if(str1.length()>=8 ||str1.length()<=28)
			{
			char c [] = str1.toCharArray();
			if(Character.isAlphabetic((int)c[0]))
			
			{
				if(c[str1.length()-1]==33||c[str1.length()-1]==64 ||c[str1.length()-1]>=35&&c[str1.length()-1]<=42||c[str1.length()-1]==94)
				
				{
					for(int i = 0;i<str1.length();i++)
					{
						if(Character.isAlphabetic((int)c[i]))
						{
							alpha_count++;
						}
							
							if(Character.isUpperCase(c[i]))
							{
								upper_count++;
								//System.out.println("up"+"->"+upper_count);
							}
							if(Character.isLowerCase(c[i]))
							{
								lower_count++;
								//System.out.println("lc"+"->"+lower_count);
							}
							if((int)c[i]==33||(int)c[i]==64 ||(int)c[i]>=35&&(int)c[i]<=42||(int)c[i]==94)
							{
								special_count++;
								//System.out.println("sp"+"->"+special_count);
							}
							if(Character.isDigit(c[i]))
							{
								digit_count++;
								//System.out.println("dc"+"->"+digit_count);
							}
						}
					
					
				}
			}
		}
		if(alpha_count>=3 && upper_count>=1 && lower_count>=2 && special_count>=1 && digit_count>=2  )
		{
			System.out.println("valid");
		}
		else
		{
			System.out.println("invalid");
		}
		
	
}

}
