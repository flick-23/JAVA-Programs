import java.io.*;
import java.lang.*;
class Sortnames // Use Bubble Sort!(Recommended)
{
	public static void main(String[]args )throws IOException
	{
		BufferedReader venki=new BufferedReader(new InputStreamReader(System.in));
		
		String c[]=new String[200];
		String t;
		int i,j,tot,num;
		
		System.out.println("\nEnter the Number of Names to be Sorted :");
		tot=Integer.parseInt(venki.readLine());
		System.out.println("\nEnter the Names :");
		for(i=0;i<tot;i++)
		{
			c[i]=venki.readLine();
		}
		for(i=0;i<(tot-1);i++)
		{
			for(j=(i+1);j<tot;j++)
			{
				if(c[i].compareTo(c[j])>0)
				{
					t=c[i];
					c[i]=c[j];
					c[j]=t;
				}
			}
		}
		System.out.println("\n Names Sorted in Alphabetical Order are as Follows	:	");
		System.out.println();
			for(i=0;i<tot;i++)
			{
				System.out.println("   "+c[i]);
				System.out.println();
			}
			
	}
}