import java.io.*;
import java.util.Scanner;
class ChefAndMean
{
	public static void main(String[]args)
	{
		Scanner venki=new Scanner(System.in);
		int T=venki.nextInt();
		int i,j,n;
		long sum=0;//mean=0;//,M=0;
		for(int t=0;t<T;t++)
		{
			sum=0;
			int flag=0;
			n=venki.nextInt();
			long a[]=new long[n];
			for(i=0;i<n;i++)
			{
				a[i]=venki.nextLong();
				sum+=a[i];
			}
			double mean=(double)sum/n;
			int k=100000;
			for(i=0;i<n;i++)
			{
				long x=sum-a[i];
				long X=n-1;
				double M=(double)x/X;
				if(M==mean)
				{
					flag=1;
					if(i<k)
					{
						k=i+1;
					}
				}
			}
			if(flag==1)
			{
				System.out.println(k);
			}
			else
			{
				System.out.println("Impossible");
			}
		}
	}
}