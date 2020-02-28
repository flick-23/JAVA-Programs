import java.io.*;
import java.util.*;
class  S10E
{
	public static void main(String[]args)throws IOException
	{
		Scanner venki=new Scanner(System.in);
		int T=venki.nextInt();
		for(int t=0;t<T;t++)
		{
			int n=venki.nextInt();
			int a[]=new int[n],i;
			for(i=0;i<n;i++)
				a[i]=venki.nextInt();
			int min=999, c=0;
			for(i=0;i<5;i++)
			{
				if(a[i]<min)
				{
					min=a[i];
					c++;
				}
			}
			for(i=5;i<n;i++)
			{
				if(a[i]<a[i-1] && a[i]<a[i-2] && a[i]<a[i-3] && a[i]<a[i-4] && a[i]<a[i-5])
					c++;
			}
			System.out.println(c);
		}
	}
}