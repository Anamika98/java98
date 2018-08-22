import java.util.Scanner;
class Addition
{
	public static void main(String args[])
	{
       Scanner sc = new Scanner(System.in);

       System.out.println("Enter first integer:");
       int a = sc.nextInt();
       System.out.println("Enter second integer:");
       int b = sc.nextInt();
       int c;
       c= a+b;
       System.out.println("Sum after addition is:"+c);
	}
}