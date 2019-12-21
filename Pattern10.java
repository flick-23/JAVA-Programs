import java.util.Scanner;
class Pattern10
{
	public static void main(String[]args)
	{
		Scanner venki=new Scanner(System.in);
		System.out.println("\nEnter the value of N : ");
		int n=venki.nextInt();
		int i,j;
		
		for(i=n;i>=1;i--)
		{
			for(j=i;j>=1;j--)
			{
				System.out.print(i);
			}
			System.out.println();
		}
		for(i=2;i<=n;i++)
		{
			for(j=i;j>=1;j--)
			{
				System.out.print(i);
			}
			System.out.println();
		}
	}
}