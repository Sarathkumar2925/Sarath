package collection;
import java.util.*;
public class Robo {
	public static void main(String args[])
	{
	Scanner s=new Scanner(System.in);
	int input1,input2;
	String input3,input4;
	System.out.println("Enter the limit of the grid:");
	input1=s.nextInt();
	input2=s.nextInt();
	System.out.println("Enter the current position:");
	input3=s.next();
	int a,b;
	a=Integer.parseInt(String.valueOf(input3.charAt(0)));
	b=Integer.parseInt(String.valueOf(input3.charAt(2)));
	System.out.println("Enter the instructions:");
	input4=s.next();	 
	int n=input4.length();
	int i=0;
	char c=input3.charAt(4);
	while(i<n)
	{
	 char t=input4.charAt(i);
	 switch(t)
	 {
	 case'l':{
	      switch(c)
	      {
	      case'n':c='w';
	              break;
	      case'w':c='s';
	              break;
	      case's':c='e';
	              break;
	      case'e':c='n';
	              break;
	      }
	         }
	      
	 case'r':{
	      switch(c)
	      {
	      case'n':c='e';
	              break;
	      case'w':c='n';
	              break;
	      case's':c='w';
	              break;
	      case'e':c='s';
	              break;
	      }
	         }

	 }
	 switch(c)
	      {
	      case'n':++b;
	              break;
	      case'w':--a;
	              break;
	      case's':--b;
	              break;
	      case'e':++a;
	              break;
	      }
	 if(a>input1||b>input2)
	 break;
	 i=i+2;
	}
	if(a<=input1&&b<=input2)
	System.out.println(a+"-"+b+"-"+c);
	else{
	if(a>input1)
	System.out.println((a-1)+"-"+b+"-"+c+"-er");
	 else
	System.out.println(a+"-"+(b-1)+"-"+c+"-er");
	}
	s.close();
	}
}
