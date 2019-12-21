// To Display pattern as per Users Choice Pg-72
import java.io.*;
class Pattern2
{
	public static void main(String[]args)throws IOException
	{
		InputStreamReader read=new InputStreamReader(System.in);
		BufferedReader venki=new BufferedReader(read);
		int i,j,choice,n;
		System.out.println("\nEnter 1 for Triangle\nEnter 2 for Inverted Triangle:");
		choice=Integer.parseInt(venki.readLine());
		switch(choice)
		{
			case 1: System.out.println("\nEnter The Number of Terms:");
					n=Integer.parseInt(venki.readLine());
					System.out.println("\nThe is a Triangle");
					for(i=1;i<=n;i++)
					{
						for (j=1;j<=i;j++)
						{
							System.out.print(i+"  ");
						}	
						System.out.println();
					}
					
			break;
			case 2: System.out.println("\nEnter The number of terms:");
					n=Integer.parseInt(venki.readLine());
					System.out.println("\nTne Inverted Triangle ");
					for(i=n;i>=1;i--)
					{
						for(j=1;j<=i;j++)
						{
							System.out.print(i+" ");
						}
						System.out.println();
					}
					
			break;
			default: System.out.println("\nWRONG CHOICE!");
		}
	}
}