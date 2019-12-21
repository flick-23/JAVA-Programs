import java.io.*;
import java.util.Scanner;
class ChinmayPatternC
{
	public static void main(String[]args)
	{
		Scanner venki=new Scanner(System.in);
		int n=venki.nextInt();
		int a[][]=new int[1000][1000],x=0,y=(2*n)-1,i,j=0,N=n,mid;
		mid=n-1;
		for(int k=0;k<N;k++)
		{
			for(i=x;i<=y;i++)
			{
				for(j=x;j<=y;j++)
				{
					if((i==x)||(j==x))
					{
						a[i][j]=n;
					}
					else if((i==y)||(j==y))
					{
						a[i][j]=n;
					}
				}
			}
			y--;
			x++; 
			n--;
		}
		for(i=0;i<(N*2)-1;i++)
		{
			for(j=0;j<(2*N)-1;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
}