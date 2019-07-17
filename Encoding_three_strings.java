package rough;
public class Encoding_three_strings {
	public static void main(String[] args) {
		 		String input[] = {"John","Johny", "Janardhan"};
		 		//String input[]= {"Sarath","Kumar","Mechanical"};
		 		String front1 = "",front2 = "",front3 = "";
		 		String middle1 = "",middle2 = "",middle3 = "";
		 		String end1 = "",end2 = "",end3 = "";
		 		
		 		for(int i = 0; i<input.length;i++)
		 		{
		 			int x = input[i].length()%3;
		 			if(x==1)	
		 			{	
		 				front1 = input[i].substring(0, 1);
		 				middle1 = input[i].substring(1, 3);
		 				end1 = input[i].substring(3);
		 				System.out.println(front1+" "+middle1+" "+end1);
		 				
		 			}
		 			else if(x==2)
		 			{
		 				front2 = input[i].substring(0, 2);
		 				middle2 = input[i].substring(2, 3);
		 				end2 = input[i].substring(3);
		 				System.out.println(front2+" "+middle2+" "+end2);
		 			}
		 			else
		 			{
		 				front3 = input[i].substring(0, 3);
		 				middle3 = input[i].substring(3, 6);
		 				end3 = input[i].substring(6);
		 				System.out.println(front3+" "+middle3+" "+end3);
		 				
		 			}
		 		}
		 		System.out.println("--------------------------------");
		 		String output1 = front1+middle2+end3;
	 			String output2 = middle1+end2+front3;
	 			String output3 = end1+front2+middle3;
	 			System.out.println(output1);
	 			System.out.println(output2);
//	 			System.out.println(output3);
	 			char temp[] = output3.toCharArray();
	 			for(int i = 0;i<output3.length();i++)
	 			{ 
	 				char x = temp[i];
	 				//System.out.print(temp[i]);
	 				if(Character.isUpperCase(x))
	 				{
	 					System.out.print(Character.toLowerCase(x));
	 				}
	 				else
	 				{
	 					System.out.print(Character.toUpperCase(x));
	 				}
	 			}
		 		
		 		
	}
}
