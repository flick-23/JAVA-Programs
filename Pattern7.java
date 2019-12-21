import java.util.Scanner;
class Pattern7
{
	public static void main(String[]args)
	{
		Scanner venki=new Scanner(System.in);
		
		System.out.println("\nEnter the value of N : ");
		int n=venki.nextInt();
		
		int i,j,k,space,od=n-1;
		
		for(i=0;i<n;i++)
		{
			for(space=1;space<=od;space++)
			{
				System.out.print(" ");
			}
			for(j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			for(k=j;k>0;k--)
			{
				System.out.print(k);
			}
			System.out.println();
			od--;
		}
		od=1;
		for(i=(n-2);i>=0;i--)
		{
			for(space=1;space<=od;space++)
			{
				System.out.print(" ");
			}
			for(j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			for(k=j;k>0;k--)
			{
				System.out.print(k);
			}
			System.out.println();
			od++;
		}
	}
}