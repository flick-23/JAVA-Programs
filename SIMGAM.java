import java.io.*;
import java.lang.*;
import java.util.*;
class SIMGAM
{
	public static void main(String[]args)throws IOException
	{
		Scanner venki=new Scanner(System.in);
		int t=venki.nextInt();
		for(int T=0;T<t;T++)
		{
			int k=0,x=0,i,j;
			long sum=0;
			int n=venki.nextInt();
			int c[]=new int[n];long a[][]=new long[10][100000];
			for(i=0;i<n;i++)
			{
				k=0;
				c[i]=venki.nextInt();
				for(j=0;j<c[i];j++)
				{
					a[i][j]=venki.nextLong();
					if(x%2==0)
					{
						sum+=a[i][k];
						k++;
					}
					x++;
				}
			}
			System.out.println(sum);
		}
	}
}