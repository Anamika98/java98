import java.util.Scanner;
class prime
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number:");
		int num = sc.nextInt();

		int count=0,i;

		for(i=2;i<=(num/2);i++)
		{
			if(num%i==0)
			{
				count=1;
				break;
			}
		}

		if(count==0)
		{
			System.out.println(num+ " is a prime number.");
		}
		else
		{
			System.out.println(num+ " is not a prime number.");
		}
	}
}