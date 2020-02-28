import java.io.*;
import java.lang.*;
import java.util.*;
class PaintWalls
{
	public static void main(String[]args)throws IOException
	{
		Scanner venki=new Scanner(System.in);
		int t=venki.nextInt();
		for(int T=0;T<t;T++)
		{
			int n=venki.nextInt();
			int m=venki.nextInt();
			int k=venki.nextInt();
			int i,j;
			long a[][]=new long[n][m];
			for(i=0;i<n;i++)
				for(j=0;j<m;j++)
					a[i][j]=venki.nextLong();
			long sum=0,min=9999999;
			int s=0;
			if(n*m>2*k)
			{
				for(int x=0;x<n-2;x++)
				{
					sum=0;
					for(i=x;i<x+2;i++)
					{
						for(j=0;j<k;j++)
						{
							System.out.print("SUM += "+a[i][j]+"  ");
							sum+=a[i][j];
						}
						
					}
					if(sum<min)
							min=sum;
					sum=0;						
					for(i=0;i<k;i++)
					{
						for(j=x;j<x+2;j++)
						{
							System.out.print("SUM += "+a[i][j]+"  ");
							sum+=a[i][j];
						}
						System.out.println();
					}
					if(sum<min)
							min=sum;
				}
				System.out.println(sum);
			}
			else
			{
				System.out.println("-1");
			}
		}
	}
}