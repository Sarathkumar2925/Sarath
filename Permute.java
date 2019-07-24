package wipro;
import java.util.*;
public class Permute {
	public static void main(String[] args) {
		String str ="abc";
		ArrayList<String>perms = new ArrayList<String>();
		if(str.length()==0)
		{
			perms.add(" ");
		}
		char first = str.charAt(0);
		String remaining = str.substring(1);
		ArrayList<String>words = perms(remaining);
		for(String j:words){
			System.out.println(j);
		}
	}

}
