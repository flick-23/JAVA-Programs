import java.io.*;
import java.lang.*;
import java.util.*;
class DIET
{
	public static void main(String[]args)throws IOException
	{
		Scanner venki=new Scanner (System.in);
		int T=venki.nextInt();
		for(int t=0;t<T;t++)
		{
			int n=venki.nextInt();
			int k=venki.nextInt();
			long sum=0,a[]=new long[n];
			int i,flag=0;
			for(i=0;i<n;i++) 
			{
				a[i]=venki.nextLong();
			}
			for(i=0;i<n;i++)
			{
				a[i]+=sum;
				if(a[i]>=k)
				{
					sum=a[i]-k;
				}
				else
				{
					flag=1;
					System.out.println("NO "+(i+1));
					break;
				}
			}
			if (flag==0)
				System.out.println("YES");
		} 
		
	}
}