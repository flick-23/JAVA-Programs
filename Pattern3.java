import java.util.Scanner;
class Pattern3
{
	public static void main(String[]args)
	{
		Scanner venki=new Scanner(System.in);
		int i,j,n,k;
		System.out.println("\nEnter the value of N :");
		n=venki.nextInt();
		for(i=1;i<=n;i++)
		{
			
			for(j=i;j<=n;j++)
			{
				System.out.print(j);
			}
			if(i>1)
			{
				for(k=1;k<i;k++)
				{
					System.out.print(k);
				}
			}
			System.out.println();	
		}
	}
}