import java.io.*;
class Matrixmul
{
	public static void main(String[]args)throws IOException
	{
		BufferedReader venki=new BufferedReader(new InputStreamReader(System.in));
		
		int a[][]=new int[20][20],b[][]=new int[20][20];
		int row,col;
		
		System.out.println("\nEnter the elements of the matrix(1) : ");
		//Reading Matrix 1
		for(row=1;row<=3;row++)
			for(col=1;col<=3;col++)
			a[row][col]=Integer.parseInt(venki.readLine());
		System.out.println("\nEnter the elements of the matrix(2) : ");
		//Reading Matrix 2
		for(row=1;row<=3;row++)
			for(col=1;col<=3;col++)
			b[row][col]=Integer.parseInt(venki.readLine());
		//Displaying the entered Matrices
		System.out.println("\nThe Entered Matrix is :" );
		for(row=1;row<=3;row++)
		{
			for(col=1;col<=3;col++)
			{
				System.out.print(a[row][col]+" ");
			}
			System.out.println();
		}
		System.out.println();
		for(row=1;row<=3;row++)
		{
			for(col=1;col<=3;col++)
			
				System.out.print(b[row][col]+" ");
			
			System.out.println();
		}
	
	
	
	
	
	
	}
}