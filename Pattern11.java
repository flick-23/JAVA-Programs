import java.util.Scanner;
class Pattern11
{
	public static void main(String[]args)
	{
		
		Scanner venki=new Scanner(System.in);
		System.out.println("\nEnter the value of N : ");
		int n=venki.nextInt();
		int i,j,od=3,s,space=n-1;
		
		for(i=1;i<=n;i++)
		{
			for(s=1;s<=space;s++)
			{
				System.out.print(" ");
			}
			for(j=1;j<=od;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			od+=2;
			space--;
		}
		od-=4;
		space=1;
		for(i=1;i<n;i++)
		{
			for(s=1;s<=space;s++)
			{
				System.out.print(" ");
			}
			for(j=1;j<=od;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			od-=2;
			space++;
		}
	}
}