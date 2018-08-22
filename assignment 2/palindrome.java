import java.util.Scanner;
class palindrome
{
	public static void main(String args[])
	{
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        int num = sc.nextInt();

        int temp,rem=0,rev=0;

        temp=num;
        while(temp!=0)
        {
      		rem = temp%10;
      		rev = rev*10 + rem;
      		temp = temp/10;
        }

        if(rev==num)
        {
        	System.out.println("Entered number is palindrome number");
        }
        else
        {
        	System.out.println("Entered number is not a palindrome number");
        }
	}
}