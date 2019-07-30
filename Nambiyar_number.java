package wipro;
import java.util.*;
public class Nambiyar_number {
	public static void main(String[] args) {
		String str,t,s="";
		Scanner in=new Scanner(System.in);
		str=in.next();
		int l=str.length();
		int i;
		for(i=0;i<l;i++){
			t=Character.toString(str.charAt(i));
			int k=Integer.parseInt(t);
			if(k%2==0){
				while(k%2==0&&i!=l-1){
					t=Character.toString(str.charAt(++i));
					k+=Integer.parseInt(t);
					//System.out.println(k);
				}
				s+=Integer.toString(k);
				
			}
			else{
				while(k%2!=0&&i!=l-1){
					t=Character.toString(str.charAt(++i));
					k+=Integer.parseInt(t);
					System.out.println(k);
				}
				s+=Integer.toString(k);
			}
		}
		System.out.println(s);
	}
}