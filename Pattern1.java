import java.util.Scanner;
class Pattern1
{
	public static void main(String[]args)
	{
		Scanner venki=new Scanner(System.in);
		System.out.println("\nEnter the value of N:");
		int n=venki.nextInt();
		int j,i,odd=1,space=n-1,k;
		for(i=1;i<=n;i++)
		{
			for(k=space;k>0;k--)
			{
				System.out.print(" ");
			}
			for(j=1;j<=odd;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			odd=odd+2;
			space--;
		}
	}
}