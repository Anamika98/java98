class Num_ptrn
{
	public static void main(String args[])
	{
		int i;
		for(i=1;i<=15;i++)
		{
			if(i<=10)
			{
			System.out.printf("%d  ",i);}
			else
			{
				System.out.printf("%d ",i);
			}
			if(i%5==0)
			{
				System.out.printf("\n");
			}
		}
	}
}