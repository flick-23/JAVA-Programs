import java.util.*;
import java.io.*;
class MSV
{
	public static void main(String[]args)throws IOException
	{
	    BufferedReader venki=new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(venki.readLine());
		for(int t=0;t<T;t++)
		{
			int n=Integer.parseInt(venki.readLine());
			long a[]=new long[n];
			int i,j,c=0,max=-1;
			StringTokenizer tk = new StringTokenizer(venki.readLine());
			for(i=0;i<n;i++)
				a[i]=Long.parseLong(tk.nextToken());
			for(i=0;i<n;i++)
			{
				c=0;
				for(j=0;j<i;j++)
				{
					if(a[j]%a[i]==0)	
						c++;
				}
				if(c>max)
					max=c;
			}
			System.out.println(max);
		}
	}
}