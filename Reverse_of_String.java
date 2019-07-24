package wipro;
public class Reverse_of_String {
	public static void main(String[] args) {
		String str = "I Am Not String";
		
		String arr[]  =str.split(" ");
		String fin ="";
		for(int i=0;i<arr.length;i++)
		{
			fin+=arr[i];
		}
		StringBuffer sb = new StringBuffer(fin);
		sb.reverse();
		//System.out.println(sb);
		for(int i = 0;i<fin.length();i++)
		{
			if(str.charAt(i)==' ')
			{
				sb.insert(i," ");
			}
			
		}
		System.out.println(sb);
		
	}
}
//g ni rtS toNmAI