import java.util.Scanner;
class Salary{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter salary of employee:");
		double sal = sc.nextDouble();
		System.out.print("Enter the grade:");
		char grade = sc.next().charAt(0);
		double Inc_sal;

		if(sal>=50000)
		{
			if(grade=='A')
			{
				Inc_sal = sal + (0.2*sal);
				System.out.println("Incremented salary is: " +Inc_sal);
			}
			else if(grade=='B')
			{
				
				Inc_sal = (sal + (0.15*sal));
				System.out.printf(" Incremented salary is: %f ", +Inc_sal);
			}
			else if(grade=='C')
			{

				Inc_sal =( sal + (0.1*sal));
				System.out.printf(" Incremented salary is: %f", +Inc_sal);
			}
			else if(grade=='D')
			{
				
				Inc_sal =( sal + (0.05*sal));
				System.out.printf(" Incremented salary is: %f", +Inc_sal);
			}
			else
			{
				System.out.printf(" Your salary is not incremented");
			}	
		}
	}
}