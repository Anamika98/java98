import java.util.Scanner;
import java.lang.NumberFormatException;
class Max{
 public static void main(String args[])
 {
String str1;
String str2;
Scanner sc=new Scanner(System.in);
System.out.println("enter the value of str1");
str1=sc.next();
System.out.println("enter the value of str2");
 str2=sc.next();
 int m=Integer.parseInt(str1);
 int n=Integer.parseInt(str2);
 if (m>n)
 {
   System.out.println("str1 is max  " +m);
 }
 else
 {
   System.out.println("str2 is max   " +n);
 }
 } 
}