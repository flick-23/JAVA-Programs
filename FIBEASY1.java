import java.io.*;
import java.lang.*;
import java.math.*;
import java.util.*;
class  FIBEASY1	
{
	public static void main(String[]args)throws IOException
	{
		BufferedReader venki=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(venki.readLine());
		int T;
		for(T=0;T<t;T++)
		{
			int i,j;
			long f1=0l,f2=1l,f=0l;
			long n=Long.parseLong(venki.readLine());
			long k=n;
			long a[]=new long[100000];
			a[0]=0;
			a[1]=1;
			try
			{
				for(f=2;f<=n+2;f++)
				{
					a[(int)f]=(f1+f2);
					f1=f2;
					f2=a[(int)f];
				}
				
			}
			catch(Exception e)
			{
				for(f=0;f<n;f++)
				{
					a[(int)f]=a[(int)f]%10;
				}
			}
			while(k!=1)
			{
				j=0;
				for(i=0;i<k;i++)
				{
					if(i%2!=0)
					{
						a[j]=a[i];
						f=a[j];
						j++;
					}
				}
				k=k/2;
			}
			System.out.println(f);
		}
	}
}