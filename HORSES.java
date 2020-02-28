import java.io.*;
import java.lang.*;
import java.util.*;
class  HORSES
{
	public static void main(String[]args)
	{
		Scanner venki=new Scanner(System.in);
		int T=venki.nextInt();
		for(int t=0;t<T;t++)
		{
			int n=venki.nextInt();
			long a[]=new long[n];
			int i,j;
			for(i=0;i<n;i++)
				a[i]=venki.nextLong();
			long max=9999999;
			for(i=0;i<n;i++)
			{
				for(j=i+1;j<n;j++)
				{
					long d=Math.abs(a[i]-a[j]);
					if(d<max)
					{
					    max=d;
					}
				}
			}
			System.out.println(max);
		}
	}	
}