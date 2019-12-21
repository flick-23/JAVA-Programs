import java.io.*;
class Diagonalmatrix
{
	public static void main(String[]args)throws IOException
	{
		BufferedReader venki=new BufferedReader (new InputStreamReader(System.in));
		int a[][]=new int [10][10];
		int i,j,row,column,sum=0;
		
		System.out.println("\nEnter the Order of Matrix:");
		System.out.println("\nEnter the Rows:");
		row=Integer.parseInt(venki.readLine());
		System.out.println("\nEnter the Columns:");
		column=Integer.parseInt(venki.readLine());
		System.out.println("\nEnter the Values of Rows And Columns Respectively!");
		for(i=0;i<row;i++)
		for(j=0;j<column;j++)
		{
			a[i][j]=Integer.parseInt(venki.readLine());
		}
		System.out.println("\nEntered Matrix is:");
		for(i=0;i<row;i++)
		{
			for(j=0;j<column;j++)
			{
				System.out.print("\t"+a[i][j]);
			}
			System.out.println("\n");
		}
		
		for(i=0;i<row;i++)
		for(j=0;j<column;j++)
		{
			if(i==j)
			{
				sum=sum+a[i][j];
					
			}
		}
		
		System.out.println("\nThe Sum of 1st Diagonal is : "+sum);
		sum=0;
		i=row;
		for(j=0;j<column;j++)
		{
		while(i==0)
			{
				sum+=a[j][i];
				i--;
			}
		}
			System.out.println("\nThe Sum of Second Diagonal:"+sum);
	}
}