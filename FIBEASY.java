import java.io.*;
import java.lang.*;
import java.math.*;
import java.util.*;
class  FIBEASY	
{
	public static void main(String[]args)throws IOException
	{
		BufferedReader venki=new BufferedReader(new InputStreamReader(System.in));
		long t=Long.parseLong(venki.readLine());
		long T;
		for(T=0;T<t;T++)
		{
			long i,j,k,f1=0l,f2=1l,f=0l;
			long n=Long.parseLong(venki.readLine());
			k=n;
			long a[];
			a=new long[(int)n];
			a[0]=0;
			a[(int)1]=1l;
			try
			{
				for(f=2;f<=n+2;f++)
				{
					a[(int)f]=(long)(f1+f2);
					f1=(long)f2;
					f2=(long)a[(int)f];
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
						a[(int)j]=a[(int)i];
						f=a[(int)j];
						j++;
					}
				}
				k=k/2;
			}
			System.out.println(f);
		}
	}
}