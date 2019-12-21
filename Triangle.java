import java.io.*;
import java.lang.*;
class Triangle
{
	public static void main(String[]args) throws IOException
	{
		BufferedReader venki=new BufferedReader(new InputStreamReader(System.in));
		
		int choice,i,j,terms;
		
		System.out.println("\nPress 1 for Triangle OR 2 for Inverted Triangle :");
		choice=Integer.parseInt(venki.readLine());
		
		switch(choice)
		{
			case 1: System.out.println("\nEnter the number of terms :");
					terms=Integer.parseInt(venki.readLine());
					for(i=1;i<=terms;i++)
					{
						for(j=1;j<=i;j++)
						{	
							System.out.print(i+" ");	
							System.out.println();
						}
					}
			break;
			case 2: System.out.println("\nEnter the number of Terms :");
					terms=Integer.parseInt(venki.readLine());
					for(i=terms;i>=1;i--)
					{
						for(j=1;j<=i;j++)
						{
							System.out.print(i+" ");
						}
						System.out.println();
					}
			break;
			default: System.out.println("\nWRONG CHOICE!!");
		}
	}
}