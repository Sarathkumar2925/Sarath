package wipro;


import java.util.ArrayList;

public class Reverse1 {
public static ArrayList<String> output1;
public static int output2;

public static void main(String[] args) {
ArrayList<String> input1 = new ArrayList<String>();
input1.add("2000");
input1.add("3000");
input1.add("J12a3N4");
monthYear(input1);
}


public static ArrayList<String> monthYear(ArrayList<String> input1) {
int s1 = Integer.parseInt(input1.get(0));
int s2 = Integer.parseInt(input1.get(1));
String s3 = input1.get(2);
String monthshu = "";
String month = "";
String year="";
for (int i = 0; i < s3.length(); i++) {
if (Character.isAlphabetic(s3.charAt(i))) {
monthshu += s3.charAt(i);
}
else{
year+=s3.charAt(i);
}
}
month = monthshu.toUpperCase();
String[] months = { "JAN", "FEB", "MAR", "APR", "MAY", "JUN", "JUL", "AUG", "SEP", "OCT", "NOV", "DEC" };
String orgmonth = "";
for (int i = 0; i < months.length; i++) {
int count = 0;
for (int j = 0; j < month.length(); j++) {
if (months[i].contains(month.charAt(j) + "")) {
count++;
}
}
if (count == 3) {
orgmonth = months[i];
}
}
ArrayList<String> list = new ArrayList<>();
for(int i=s1;i<s2;i++){
String yearlimit=Integer.toString(i);
String c1=year.charAt(0)+"";
String c2=year.charAt(1)+"";
String c3=year.charAt(2)+"";
String c4=year.charAt(3)+"";
if(yearlimit.contains(c1)&&yearlimit.contains(c2)&&yearlimit.contains(c3)&&yearlimit.contains(c4)){
list.add(orgmonth+"/"+yearlimit);
}
}
output1=list;
output2 = list.size();
System.out.println(output1);
System.out.println(output2);
return output1;
}
}