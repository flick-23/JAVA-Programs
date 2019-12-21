import java.util.Scanner;
class Pattern9
{
	public static void main(String[]args)
	{
		Scanner venki=new Scanner(System.in);
		System.out.println("\nEnter the value of N : ");
		int n=venki.nextInt();
		int i,j;
		for(i=1;i<=n;i++)
		{
			for(j=i;j<=n;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
}