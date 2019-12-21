import java.io.*;
import java.lang.*;
class Dualmatix
{
	public static void main(String[]args) throws IOException
	{
		BufferedReader venki=new BufferedReader(new InputStreamReader(System.in));
		int m1[][]=new int[10][10],m2[][]=new int[10][10];
		int row,column,i,j,a,b;
		int m3[][]=new int[20][20];
		
		System.out.println("\nEnter the Order of Matrix:");
		System.out.println("\nEnter the Rows:");
		row=Integer.parseInt(venki.readLine());
		System.out.println("\nEnter the number of Columns:");
		column=Integer.parseInt(venki.readLine());
		
		System.out.println("\nEnter the Elements Of Rows & Columns Respectively:");
		for(i=0;i<row;i++)
		for(j=0;j<column;j++)
		m1[i][j]=Integer.parseInt(venki.readLine());
		
		System.out.println("\nThe Entered Matrix is:");
		for(j=0;j<column;j++)
		{
			for(i=0;i<row;i++)
			{
				System.out.print(m1[i][j]+"\t");
			}
			System.out.println("\n");
		}
		
		
		System.out.println("\nEnter the Order of 2nd Matrix:");
		System.out.println("\nEnter the Rows:");
		row=Integer.parseInt(venki.readLine());
		System.out.println("\nEnter the number of Columns:");
		column=Integer.parseInt(venki.readLine());
		System.out.println("\nEnter the Elements Of Rows & Columns Respectively:");
		for(i=0;i<row;i++)
		for(j=0;j<column;j++)
		m2[i][j]=Integer.parseInt(venki.readLine());
		
		System.out.println("\nThe Entered Matrix is:");
		for(j=0;j<column;j++)
		{
			for(i=0;i<row;i++)
			{
				System.out.print(m2[i][j]+"\t");
			}
			System.out.println("\n");
		}
		
		System.out.println("\nAdding The Both the Matrix!");
		if(m1[i][j]==m2[i][j])
		{
			for(i=0;i<row;i++)
			for(j=0;j<column;j++)
			m3[i][j]=m1[i][j]+m2[i][j];
			System.out.println("\nShowing the Result:");
			
			for(j=0;j<column;j++)
			{
				for(i=0;i<row;i++)
				{
					System.out.print(m3[i][j]+"\t");
				}
				System.out.println("\n");
			}
		}
		else
		{
			System.out.println("\nThe Matrix Could Not Be Added ! Because the Order of Elements Did Not Match In Matrix 1 & Matrix 2");
		}
	}
}
