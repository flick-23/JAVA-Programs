import java.util.Scanner;
class Pattern4
{
	public static void main(String[]args)
	{
		Scanner venki=new Scanner(System.in);
		int j,i,k,p;
		System.out.println("\nEnter the value of N : ");
		int n=venki.nextInt();
		int space=n-1;
			
		for(i=1;i<=n;i++)
		{			
			for(p=space;p>0;p--)
			{
				System.out.print(" ");
			}	
			space--;
				for(j=1;j<=i;j++)
				{
					System.out.print(j);
				}
				if(i>1)
				{
					for(k=i;k>=1;k--)
					{
						int t=k;
						t--;
						if(t!=0)
						System.out.print(t);
					}
				}
				System.out.println();
			
		}
		
	}
}